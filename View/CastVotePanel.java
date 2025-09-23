package View;

import javax.swing.*;
import java.awt.*;

public class CastVotePanel extends JPanel {
    private final String[] parties = {"Alpha Party", "Beta Party", "Gamma Party"};
    private int[] votes = {0, 0, 0}; // simple local vote storage

    public CastVotePanel(VotingSystemUI parent) {
        setLayout(new BorderLayout());
        setBackground(new Color(245, 255, 245));

        JLabel title = new JLabel("Cast Your Vote", SwingConstants.CENTER);
        title.setFont(new Font("Segoe UI", Font.BOLD, 26));
        title.setBorder(BorderFactory.createEmptyBorder(25,0,20,0));

        JPanel partyList = new JPanel();
        partyList.setLayout(new GridLayout(parties.length, 1, 20, 20));
        partyList.setBorder(BorderFactory.createEmptyBorder(20,60,20,60));
        partyList.setOpaque(false);

        for (int i = 0; i < parties.length; i++) {
            int idx = i;
            JPanel row = new JPanel(new BorderLayout());
            row.setBackground(new Color(230,240,250));
            row.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
            row.setPreferredSize(new Dimension(0, 80));

            JLabel label = new JLabel(parties[i]);
            label.setFont(new Font("Segoe UI", Font.BOLD, 20));
            row.add(label, BorderLayout.CENTER);

            JButton voteBtn = new JButton("Vote");
            voteBtn.setBackground(new Color(25,118,210));
            voteBtn.setForeground(Color.WHITE);
            voteBtn.setFont(new Font("Segoe UI", Font.BOLD, 16));
            voteBtn.setFocusPainted(false);
            voteBtn.addActionListener(e -> {
                votes[idx]++;
                JOptionPane.showMessageDialog(this,
                        "Your vote for " + parties[idx] + " has been recorded!",
                        "Vote Cast", JOptionPane.INFORMATION_MESSAGE);
            });

            row.add(voteBtn, BorderLayout.EAST);
            partyList.add(row);
        }

        // Navigation button
        JButton backBtn = new JButton("Back");
        backBtn.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        backBtn.addActionListener(e -> parent.showScreen("MainMenu"));
        JPanel botPanel = new JPanel();
        botPanel.setOpaque(false);
        botPanel.add(backBtn);

        add(title, BorderLayout.NORTH);
        add(partyList, BorderLayout.CENTER);
        add(botPanel, BorderLayout.SOUTH);
    }
}