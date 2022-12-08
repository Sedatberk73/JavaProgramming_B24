package saimonlypractise.objectpractice;

import java.util.ArrayList;

public class module {
    ArrayList<file>files;//referrens to hoole file object

    public module() {

        files=new ArrayList<>();
    }

  public module(ArrayList<file> file){
        this();
        this.files.addAll(file);
  }


    @Override
    public String toString() {
        return "module{" +
                "files=" + files +
                '}';
    }
    public void module(ArrayList<file> files){
        this.files.remove(files);
    }









}
