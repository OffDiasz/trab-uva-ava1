package entities;

public class Hardware {
	
	int memRam;
	int ssd;
	String placa_Video;
	String placa_Mae;
	

	//Construtor default
	
	public Hardware() {
		this.memRam = 0;
		this.ssd = 0;
		this.placa_Video = "Não informada";
		this.placa_Mae = "Não informada";
	}
	
	//Construtor com parâmetros
	
	public Hardware(int memRam, int ssd, String placa_Video, String placa_Mae) {
		this.memRam = memRam;
		this.ssd = ssd;
		this.placa_Video = placa_Video;
		this.placa_Mae = placa_Mae;
	}
	
	//Métodos de acesso (get/set)

	public int getMemRam() {
		return memRam;
	}

	public void setMemRam(int memRam) {
		this.memRam = memRam;
	}

	public int getSsd() {
		return ssd;
	}

	public void setSsd(int ssd) {
		this.ssd = ssd;
	}

	public String getPlaca_Video() {
		return placa_Video;
	}

	public void setPlaca_Video(String placa_Video) {
		this.placa_Video = placa_Video;
	}

	public String getPlaca_Mae() {
		return placa_Mae;
	}

	public void setPlaca_Mae(String placa_Mae) {
		this.placa_Mae = placa_Mae;
	}

}
