package org.df.primfaces;

import jakarta.faces.bean.ManagedBean;

@ManagedBean(name = "dialogBean") // Define el bean como manejado por JSF
public class DialogBean {

    private String mensaje;

    // Getter y Setter
    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    // Métodos para acciones
    public void confirmar() {
        mensaje = "Acción confirmada.";
    }

    public void cancelar() {
        mensaje = "Acción cancelada.";
    }
}
