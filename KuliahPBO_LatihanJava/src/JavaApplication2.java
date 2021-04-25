


import java.util.Scanner;

public class JavaApplication2 {

    public static void main(String[] args) {
        String [][]entry = new String[100][3];
        entry[0] = new String[]{"Florence","735-1234","Manila"};
        entry[1] = new String[]{"Joyce","983-3333","Quezon City"};
        entry[2] = new String[]{"Becca","456-3322","Manila"};
        int jawab,cek = 0;
        
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Menu Program \n" +
            "1. Cetak Data\n" +
            "2. Isi Data\n" +
            "3. Pencarian Data\n" +
            "4. Ubah Data\n" +
            "5. Hapus Data\n" +
            "6. EXIT\n" +
            "Pilihan Anda (1-6):");
            jawab = scan.nextInt();
            
            switch(jawab) {
                case 1:
                    for (int i = 0; i < entry.length; i++) {
                        if (entry[i][0] != null) {
                            System.out.println("Name :" + entry[i][0] + "\n" +
                            "Tel. # : " + entry[i][1] + "\n" +
                            "Address : " + entry[i][2] + "\n");
                        }
                    }
                    jawab = 0;
                    break;
                case 2:
                    for (int i = 0; i < entry.length; i++) {
                        if (entry[i][0] != null) {
                            cek += 1;
                        }
                    }
                    System.out.println("Data baru :");
                    System.out.println("Input nama : ");
                    String namaBaru = scan.next();
                    entry[cek][0] = namaBaru;
                    System.out.println("Input telepon : ");
                    String teleponBaru = scan.next();
                    entry[cek][1] = teleponBaru;
                    System.out.println("Input alamat : ");
                    String alamatBaru = scan.next();
                    entry[cek][2] = alamatBaru;
                    jawab = 0;
                    break;
                case 3:
                    System.out.println("Input nama yang ingin dicari : ");
                    String search = scan.next();
                    for (int i = 0; i < entry.length; i++) {
                        if (entry[i][0].equals(search)) {
                            System.out.println("Name :" + entry[i][0] + "\n" +
                            "Tel. # : " + entry[i][1] + "\n" +
                            "Address : " + entry[i][2] + "\n");
                            break;
                        }
                    }
                    jawab = 0;
                    break;
                case 4:
                    System.out.println("Input nama yang ingin diubah : ");
                    String ubah = scan.next();
                    for (int i = 0; i < entry.length; i++) {
                        if (entry[i][0].equals(ubah)) {
                            System.out.println("Data baru :");
                            System.out.println("Input nama : ");
                            namaBaru = scan.next();
                            entry[i][0] = namaBaru;
                            System.out.println("Input telepon : ");
                            teleponBaru = scan.next();
                            entry[i][1] = teleponBaru;
                            System.out.println("Input alamat : ");
                            alamatBaru = scan.next();
                            entry[i][2] = alamatBaru;
                            break;
                        }
                    }
                    jawab = 0;
                    break;
                case 5:
                    System.out.println("Input nama yang ingin dihapus : ");
                    String delete = scan.next();
                    for (int i = 0; i < entry.length; i++) {
                        if (entry[i][0].equals(delete)) {
                            entry[i][0] = null;
                            entry[i][1] = null;
                            entry[i][2] = null;
                            break;
                        }
                    }
                    jawab = 0;
                    break;
                case 6:
                    System.exit(0);
                    break;
            }
        } while (jawab == 0);
        
        
    }
    
}
