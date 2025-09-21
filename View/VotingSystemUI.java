package View;


import javax.swing.*;
import java.awt.*;

public class VotingSystemUI extends JFrame {
    CardLayout cardLayout = new CardLayout();
    JPanel mainPanel = new JPanel(cardLayout);

    public VotingSystemUI() {
        setTitle("Voting System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 600);
        setLocationRelativeTo(null);

        // Create views
        MainMenuPanel mainMenu = new MainMenuPanel(this);
        CastVotePanel castVote = new CastVotePanel(this);
        PartiesPanel partiesList = new PartiesPanel(this);
        ResultPanel results = new ResultPanel(this);

        // Add views to CardLayout
        mainPanel.add(mainMenu, "MainMenu");
        mainPanel.add(castVote, "CastVote");
        mainPanel.add(partiesList, "Parties");
        mainPanel.add(results, "Results");

        add(mainPanel);
        cardLayout.show(mainPanel, "MainMenu");
    }

    public void showScreen(String name) {
        cardLayout.show(mainPanel, name);
    }

}