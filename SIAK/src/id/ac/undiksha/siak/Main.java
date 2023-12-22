package id.ac.undiksha.siak;

import id.ac.undiksha.siak.people.Manusia;
import id.ac.undiksha.siak.people.Mahasiswa;
import id.ac.undiksha.siak.people.Dosen;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mahasiswa Ani =  new Mahasiswa();
		
		Ani.setNim("12345");
		Ani.setNama("ani");
		Ani.setTanggalLahir("12 Februari 2000");
		Ani.setProdi("Algoritma Pemograman");
		Ani.setAlamat("Wall Maria");
		Ani.setJeniskelamin(false); 


		
		/*ani.nim = "2215092";
		ani.nama = "ani";
		ani.tanggalLahir = "1 Januari 2000";
		ani.jeniskelamin = true;
		ani.prodi = "Ilmu Komputer";
		ani.alamat = "Singaraja";
		*/
		
		System.out.println(Ani.getNim());
		System.out.println(Ani.getNama());
		System.out.println(Ani.getTanggalLahir());
		//System.out.println(Ani.getProdi());
		System.out.println(Ani.getAlamat());
		System.out.println(Ani.getJenisKelamin());
		
		
		 Dosen levi = new Dosen();
	       	levi.setNip("12345");
	        levi.setNamadosen("levi");
	        levi.setAlamat("Wall rose");
	        levi.setMataKuliah("Pengajar 3D Manuver");
	        levi.setJenisKelamin(true);

	        System.out.println("---------");
	        
	        System.out.println(levi.getNip());
	        System.out.println(levi.getNamadosen());
	        System.out.println(levi.getAlamat());
	        System.out.println(levi.getJenisKelamin());
	        System.out.println(levi.getMataKuliah());
		
	        System.out.println("-----------");
		
	}

}
