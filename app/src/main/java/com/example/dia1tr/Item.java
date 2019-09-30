package com.example.dia1tr;

public class Item {
    String ID;
    String tipo;
    String otros;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getOtros() {
        return otros;
    }

    public void setOtros(String otros) {
        this.otros = otros;
    }

    public Item(String ID, String Tipo, String Otros) {
        this.ID = ID;
        this.tipo = Tipo;
        this.otros = Otros;
    }
}
