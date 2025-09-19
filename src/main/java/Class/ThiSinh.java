package Class;
import java.util.Scanner;
public class ThiSinh {
    private int soBD;
    private String hoTen;
    private String diaChi;
    private String diemUuTien;
    public ThiSinh(){
        
    }
    public ThiSinh(int soBD, String hoTen, String diaChi, String diemUuTien){
        this.soBD=soBD;
        this.hoTen=hoTen;
        this.diaChi=diaChi;
        this.diemUuTien=diemUuTien;
    }
    public void nhapThongTin(Scanner sc){
        System.out.println("\tNhap so bao danh");
        soBD=sc.nextInt();
        sc.nextLine();
        System.out.println("\tNhap ho ten");
        hoTen=sc.nextLine();
        System.out.println("\tNhap dia chi");
        diaChi=sc.nextLine();
        System.out.println("\tNhap Diem Uu Tien");
        diemUuTien=sc.nextLine();
    }
    public void hienThiThongTin(){
        System.out.println("\tSo bao danh:"+soBD);
        System.out.println("\tHo ten:"+hoTen);
        System.out.println("\tDia chi:"+diaChi);
        System.out.println("\tDiem Uu Tien:"+diemUuTien);
    }
    public int getsoBD(){
        return soBD;
    }
}
