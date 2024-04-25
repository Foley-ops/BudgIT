package com.example.budgit.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.budgit.R;
import com.example.budgit.databinding.FragmentDashboardBinding;

public class DashboardFragment extends Fragment {
    private FragmentDashboardBinding binding;

    public DashboardFragment(){
        super(R.layout.fragment_dashboard);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}