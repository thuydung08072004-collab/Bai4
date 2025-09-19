package Class;
import java.util.Scanner;
import java.util.ArrayList;
public class TuyenSinh {
    private ArrayList<ThiSinh> dsts;
    public TuyenSinh(){
        dsts = new ArrayList<ThiSinh>(10);
        
    }
    public void themThiSinh(ThiSinh ts){
        dsts.add(ts);
    }
    public void nhapDanhSach(Scanner sc){
        ThiSinh ts;
        int chon;
        System.out.println("Nhap vao so lupng thi sinh: ");
        int n=sc.nextInt();
        sc.nextLine();
        for (int i=0;i<n;i++){
            System.out.println("Thi sinh thuoc khoi nao (1-KhoiA; 2-KhoiB; 3-KhoiC):");
            chon=sc.nextInt();
            switch (chon) {
                case 1:
                    ts=new KhoiA("Toan", "Ly", "Hoa");
                    break;
                case 2:
                    ts=new KhoiB("Toan", "Sinh", "Hoa");
                    break;
                case 3:
                    ts=new KhoiA("Van", "Lich Su", "Dia Ly");
                    break;
                default:
                   ts=new KhoiA("Toan", "Ly", "Hoa");
                    break;
            }
            ts.nhapThongTin(sc);
            themThiSinh(ts);
        }}
        public void hienThiDanhSach(){
            int n=dsts.size();
            for(int i=0; i<n;i++){
                System.out.println("\tThi sinh thu "+(i+1)+" la: ");
                dsts.get(i).hienThiThongTin();
            }
        }
        public void timKiemThiSinh(int soBaoDanh){
            for(ThiSinh ts: dsts){
                if(ts.getsoBD()==soBaoDanh){
                    ts.hienThiThongTin();
                }
            }
        }
    }

