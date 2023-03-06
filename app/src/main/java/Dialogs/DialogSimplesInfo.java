package Dialogs;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;

public class DialogSimplesInfo extends AppCompatDialogFragment {
    private String msg;
    private String Titulo;

    public DialogSimplesInfo(String msg, String Titulo) {
        this.msg = msg;
        this.Titulo = Titulo;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(getTitulo()).setMessage(getMsg())
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
//                        setMsg("Deu certo!");
//                        System.out.println("----------------------------------");
//                        System.out.println("\n: "+getMsg());
//                        System.out.println("\n----------------------------------");
                    }
                });
        return builder.create();

    }
}
