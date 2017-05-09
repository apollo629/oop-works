package us.inal.oop;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

/**
 * Created by alpereninal on 18/12/16.
 */
public class Panel implements Observer {

    public Map<Integer, Observable> observables;
    public JFrame frame;
    public JPanel guiPanel;

    public Panel(Map<Integer, Observable> observables) {
        this.observables = observables;
        prepare();
        display();

    }

    private void prepare(){
        for(Integer id : observables.keySet()) {
            observables.get(id).attach(this);
        }
    }

    @Override
    public void update(Observable o) {
        System.out.println(o + " state is updated!! its state now: " + (o.getState() == Boolean.FALSE ? "CLOSED" : "OPEN") );
        if(o.getState()){
            this.guiPanel.getComponent(o.getId()).setBackground(Color.green);
        }else {
            this.guiPanel.getComponent(o.getId()).setBackground(Color.red);
        }
    }

    @Override
    public void display() {
        this.frame = new JFrame();
        this.guiPanel = new JPanel();
        frame.setBackground(Color.white);
        frame.setSize(100,1000);
        for(Integer id : observables.keySet()){
            JButton button= new JButton();
            button.setBorder(BorderFactory.createLineBorder(Color.black));
            button.setSize(50, 50);
            button.setLocation(50 * (id + 1), 50);
            button.setBackground(Color.red);
            button.setContentAreaFilled(false);
            button.setOpaque(true);
            button.setVisible(true);
            button.setText("Door "+id);
            guiPanel.add(button);

        }
        frame.add(guiPanel);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
