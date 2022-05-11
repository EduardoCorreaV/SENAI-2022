
public abstract class Terrestres extends Veiculos {

	private String crv;
	private String ipva;
	private String dpvat;
	private String placa;
	private boolean conversivel;
	private String tipoCNH;
	
	public String getCrv() {
		return crv;
	}
	public void setCrv(String crv) {
		this.crv = crv;
	}
	public String getIpva() {
		return ipva;
	}
	public void setIpva(String ipva) {
		this.ipva = ipva;
	}
	public String getDpvat() {
		return dpvat;
	}
	public void setDpvat(String dpvat) {
		this.dpvat = dpvat;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public boolean isConversivel() {
		return conversivel;
	}
	public void setConversivel(boolean conversivel) {
		this.conversivel = conversivel;
	}
	public String getTipoCNH() {
		return tipoCNH;
	}
	public void setTipoCNH(String tipoCNH) {
		this.tipoCNH = tipoCNH;
	}
	
}

