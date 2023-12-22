package id.ac.undiksha.siak.people;

public class Dosen {

	public String nip;
	public String namadosen;
	public String jurusan; 
	public String matakuliah; 
	public String tanggalLahir;
	public String alamat;
	public boolean JenisKelamin;
	
	
	public String getNip() {
		return nip;
	}
	public void setNip(String nip) {
		this.nip = nip;
	}
	public String getNamadosen() {
		return namadosen;
	}
	public void setNamadosen1(String namadosen) {
		this.namadosen = namadosen;
	}
	public String getJurusan() {
		return jurusan;
	}
	public void setJurusan(String jurusan) {
		this.jurusan = jurusan;
	}
	public String getMataKuliah() {
		return matakuliah;
	}
	public void setMataKuliah(String matakuliah) {
		this.matakuliah = matakuliah;
	}
	public String getTanggalLahir() {
		return tanggalLahir;
	}
	public void setTanggalLahir(String tanggalLahir) {
		this.tanggalLahir = tanggalLahir;
	}
	public String getAlamat() {
		return alamat;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	
	public boolean isJenisKelamin() {
		return JenisKelamin;
	}

    public String getJenisKelamin() {
        if (this.isJenisKelamin()) {
        	return "laki-laki";
        } else {
            return "perempuan";
        }
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        this.JenisKelamin = jenisKelamin;
    }
	public void setNamadosen(String namadosen) {
		// TODO Auto-generated method stub
		
	}
	
}
