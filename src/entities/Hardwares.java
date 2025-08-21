package entities;

public class Hardwares {
	
	int memRam;
	String ssd;
	String placa_Video;
	String hd;
	
	public void Computador(){
		
	}

	public Hardwares(int memRam, String ssd, String placa_Video, String hd) {
		this.memRam = memRam;
		this.ssd = ssd;
		this.placa_Video = placa_Video;
		this.hd = hd;
	}

	public int getMemRam() {
		return memRam;
	}

	public void setMemRam(int memRam) {
		this.memRam = memRam;
	}

	public String getSsd() {
		return ssd;
	}

	public void setSsd(String ssd) {
		this.ssd = ssd;
	}

	public String getPlaca_Video() {
		return placa_Video;
	}

	public void setPlaca_Video(String placa_Video) {
		this.placa_Video = placa_Video;
	}

	public String getHd() {
		return hd;
	}

	public void setHd(String hd) {
		this.hd = hd;
	}
	
	
	
	

}
