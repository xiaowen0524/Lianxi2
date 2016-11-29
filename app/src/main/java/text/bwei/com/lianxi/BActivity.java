package text.bwei.com.lianxi;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class BActivity extends Fragment {

    private View view;
    private Button BtA, BtC, BtD;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = View.inflate(getActivity(), R.layout.activity_b, null);
        Log.d("**********B", "onCreateView()");
        BtA();
        BtC();
        BtD();
        return view;
    }

    public void BtA() {
        BtA = (Button) view.findViewById(R.id.BtA);
        BtA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MainActivity.class);
                intent.putExtra("fragment", 0);
                startActivity(intent);
            }
        });
    }

    public void BtC() {
        BtC = (Button) view.findViewById(R.id.BtC);
        BtC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MainActivity.class);
                intent.putExtra("fragment", 2);
                startActivity(intent);
            }
        });
    }

    public void BtD() {
        BtD = (Button) view.findViewById(R.id.BtD);
        BtD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), DActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d("**********B", "onAttach()");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("**********B", "onCreate()");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("**********B", "onActivityCreated()");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("**********B", "onStart()");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("**********B", "onResume()");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("**********B", "onPause()");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("**********B", "onStop()");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("**********B", "onDestroyView()");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("**********B", "onDestroy()");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("**********B", "onDetach()");
    }
}
