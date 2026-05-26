package com.marketplace.app;

import com.formdev.flatlaf.FlatLightLaf;
import com.marketplace.app.controller.MarketplaceController;
import com.marketplace.app.view.MarketplaceView;
import com.marketplace.repository.db.ProdukRepository;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class Main {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
            UIManager.put("Button.arc", 4); // Diperkecil sedikit agar senada dengan bentuk tombol di screenshot
            UIManager.put("Component.arc", 4);
            UIManager.put("TextComponent.arc", 4);
        } catch (Exception e) {
            System.err.println("Gagal memuat tema FlatLaf.");
        }

        SwingUtilities.invokeLater(() -> {
            MarketplaceView view = new MarketplaceView();
            ProdukRepository repo = new ProdukRepository();
            MarketplaceController app = new MarketplaceController(view, repo);
            app.start();
        });
    }
}