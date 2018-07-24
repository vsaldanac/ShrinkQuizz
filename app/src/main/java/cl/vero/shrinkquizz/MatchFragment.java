package cl.vero.shrinkquizz;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;


public class MatchFragment extends Fragment {


    public MatchFragment() {
        // Required empty public constructor
    }

    public static MatchFragment newInstance(){
        return new MatchFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_match, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final SeekBar userSb = view.findViewById(R.id.userSb);
        final TextView userTv = view.findViewById(R.id.userTv);
        final SeekBar nicoSb = view.findViewById(R.id.nicoSb);
        final TextView nicoTv = view.findViewById(R.id.nicoTv);
        Button button = view.findViewById(R.id.sendBtn);

    userSb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
            userTv.setText(String.valueOf(i));
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    });

    nicoSb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
            nicoTv.setText(String.valueOf(i));
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    });

    button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int user = userSb.getProgress();
            int nico = nicoSb.getProgress();
            int sum = user + nico;
            String answer = "Hola, entre los dos tienen " + sum + " años.";
            Toast.makeText(getContext(), answer , Toast.LENGTH_SHORT).show();
        }
    });

    }


}
