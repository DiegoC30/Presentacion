package org.df.presentacion;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;

@Named("dialogBean")
@SessionScoped
public class DialogBean implements Serializable {

    private String message;

    public DialogBean() {
        this.message = "¡Hola desde el Dialog!";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void showMessage() {
        this.message = "¡Mensaje actualizado desde el Bean!";
    }
}