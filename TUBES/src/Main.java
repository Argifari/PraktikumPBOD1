public class Main {

    public static void main(String[] args) {
        try {
            Admin admin = new Admin("Budi_Ops", "budi@tiket.com", "ADM-001");
            admin.printInfo();

      
            Event konserTulus = new Event("Konser Tulus 2024");
            System.out.println("Event Baru Dibuat: " + konserTulus.getName());

    
            Ticket v1 = new VIPTicket("VIP-A1", 1000000);
            Ticket r1 = new RegularTicket("REG-B1", 500000);
            konserTulus.addTicketToEvent(v1);
            konserTulus.addTicketToEvent(r1);


            Customer buyer = new Customer("Siska", "siska@email.com",1);
            buyer.printInfo();

            Order pesananSiska = new Order(buyer);
            

            Ticket tiketYangDipilih = konserTulus.getAvailableTickets().get(0);
            
            pesananSiska.addTicket(tiketYangDipilih, 2); 
            
            double totalHarga = pesananSiska.getTotal();
            System.out.println("Total Tagihan Siska: Rp" + totalHarga);

            // --- Fase Pembayaran (Exception Handling) ---
            if (totalHarga > 5000000) {
                throw new PaymentException("Limit transaksi harian terlampaui!");
            } else {
                System.out.println("Pembayaran Berhasil! Tiket dikirim ke " + buyer.email);
            }            
        }catch (PaymentException e) {
            System.out.println("Gagal Bayar : " + e.getMessage());
        }catch (Exception e) {
            System.out.println("Terjadi kesalahan sistem.");
        }
    }
}