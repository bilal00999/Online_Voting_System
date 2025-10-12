package View;

import javax.swing.*;
import java.awt.*;

public class MainMenuPanel extends JPanel {
    public MainMenuPanel(VotingSystemUI parent) {
        setLayout(new BorderLayout());
        setBackground(new Color(245,245,255));

        JLabel title = new JLabel("Voting System", SwingConstants.CENTER);
        title.setFont(new Font("Segoe UI", Font.BOLD, 32));
        title.setBorder(BorderFactory.createEmptyBorder(30, 0, 10, 0));

        JPanel buttonPanel = new JPanel(new GridLayout(3, 1, 25, 25));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(50, 60, 100, 60));
        buttonPanel.setOpaque(false);

        JButton castVoteBtn = createBtn("Cast Vote", new Color(25,118,210), Color.WHITE);
        JButton partiesBtn = createBtn("View Parties", new Color(56,142,60), Color.WHITE);
        JButton resultsBtn = createBtn("Check Result", new Color(251,192,45), Color.BLACK);

        castVoteBtn.addActionListener(e -> parent.showScreen("CastVote"));
        partiesBtn.addActionListener(e -> parent.showScreen("Parties"));
        resultsBtn.addActionListener(e -> parent.showScreen("Results"));

        buttonPanel.add(castVoteBtn);
        buttonPanel.add(partiesBtn);
        buttonPanel.add(resultsBtn);

        add(title, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
    }

    private JButton createBtn(String name, Color bg, Color fg) {
        JButton btn = new JButton(name);
        btn.setBackground(bg);
        btn.setForeground(fg);
        btn.setFont(new Font("Segoe UI", Font.BOLD, 20));
        btn.setFocusPainted(false);
        btn.setBorder(BorderFactory.createEmptyBorder(15, 10, 15, 10));
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        return btn;
    }
}