package controllers;

import views.ViewCommand;

public class SimpleComportementBtnStep extends Comportement {
    public SimpleComportementBtnStep(ViewCommand cVw) {
        super(cVw);
    }

    public void ajuste() {
        cView.run.setEnabled(false);
        cView.step.setEnabled(false);
        cView.pause.setEnabled(false);
        cView.restart.setEnabled(true);
        cView.game.isRunning = true;
    }
}
