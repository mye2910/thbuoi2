
package cd;

public class Cd {
    private int macd;
    private String tencd;
    private int sobh;
    private float giathanh;
    public Cd() {
    }
    public Cd(int macd,String tencd,int sobh,float giathanh) {
        this.macd = macd;
        this.tencd = tencd;
        this.sobh = sobh;
        this.giathanh = giathanh;
    }
    public int getmacd() {
        return macd;
    }
 
    public void setmacd(int macd) {
        this.macd = macd;
    }
 
    public String gettencd() {
        return tencd;
    }
 
    public void settencd(String tencd) {
        this.tencd = tencd;
    }
 
    public int getsobh() {
        return sobh;
    }
 
    public void setsobh(int sobh) {
        this.sobh = sobh;
    }
 
    public float getgiathanh() {
        return giathanh;
    }
 
    public void setgiathanh(float giathanh) {
        this.giathanh = giathanh;
    }
    @Override
    public String toString() {
        return "Cd{" + "Cd=" + macd + ", tencd=" + tencd  + ", sobh=" + sobh +", giathanh=" + giathanh + "}";
    }
    public void luutrucd(){
        System.out.printf("%-10d %-20s %-20s %-10d %-20.1f \n",macd,tencd,sobh,giathanh);
    }


    boolean getGiaThanh() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void hienThiAlbum() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

        

    
   
        
    
    

