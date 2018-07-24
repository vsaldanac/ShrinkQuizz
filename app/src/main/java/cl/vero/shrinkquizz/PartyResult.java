package cl.vero.shrinkquizz;

import android.content.Context;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class PartyResult extends PartyAnswer {

    public PartyResult(String answer) {
        super(answer);
    }

    public String score(){
        return processing();
    }

    private String processing(){
        String answer = getAnswer();

        if (answer.contains("1")){
            Log.d("TAG","Pocos");
            return "Pocos";
        } else if (answer.contains("2")){
            return "Varios";
        } else {
            return "Muchos";
        }
    }
}
