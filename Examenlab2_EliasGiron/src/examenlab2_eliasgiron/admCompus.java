package examenlab2_eliasgiron;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class admCompus {
    private ArrayList<Computadora> listacomputadoras = new ArrayList();
    private File archivo = null;

    public admCompus(String path) {
        archivo = new File(path);
    }

    public ArrayList<Computadora> getListacomputadoras() {
        return listacomputadoras;
    }

    public void setlistacomputadoras (ArrayList<Computadora> listacomputadoras ) {
        this.listacomputadoras  = listacomputadoras ;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "listacomputadoras = " + listacomputadoras ;
    }

    public void setComputadora(Computadora p) {
        this.listacomputadoras .add(p);
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Computadora t : listacomputadoras) {
                bw.write(t.getColor()+ ";");
                bw.write(t.getSerie()+ ";");
                bw.write(t.getMaterial()+ ";");
                bw.write(t.getBateria()+ ";");
                bw.write(t.getHdd()+ ";");
                bw.write(t.getPantalla()+ ";");
                bw.write(t.getProcesador()+ ";");
                bw.write(t.getRam()+ ";");
                bw.write(t.getTeclado()+ ";");
            }
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner write = null;
        listacomputadoras = new ArrayList();
        if (archivo.exists()) {
            try {
                write = new Scanner(archivo);
                write.useDelimiter(";");
                while (write.hasNext()) {
                    listacomputadoras.add(new Computadora(write.next(), write.next(), write.next(), write.next(), write.next(), write.next(), write.next(), write.next(), write.next(), write.next()));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            write.close();
        }
    }
}
