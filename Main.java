import View.VotingSystemUI;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new VotingSystemUI().setVisible(true));

    }
}
