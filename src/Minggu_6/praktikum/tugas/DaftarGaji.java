package Minggu_6.praktikum.tugas;

class DaftarGaji {
    private Pegawai[] listPegawai;
    private int index;

    public DaftarGaji(int kapasitas) {
        listPegawai = new Pegawai[kapasitas];
        index = 0;
    }

    public void addPegawai(Pegawai p) {
        if (index < listPegawai.length) {
            listPegawai[index] = p;
            index++;
        } else {
            System.out.println("Kapasitas daftar penuh!");
        }
    }

    public void printSemuaGaji() {
        for (int i = 0; i < index; i++) {
            System.out.println("Nama: " + listPegawai[i].getNama() +
                               "\t| Gaji: Rp" + listPegawai[i].getGaji());
        }
    }
}