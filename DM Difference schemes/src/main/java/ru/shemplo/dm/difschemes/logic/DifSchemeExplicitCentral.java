package ru.shemplo.dm.difschemes.logic;

import ru.shemplo.dm.difschemes.logic.DifferenceScheme.Scheme;

@Scheme (name = "Явная центральная")
public class DifSchemeExplicitCentral extends AbsDifferenceScheme {

    public DifSchemeExplicitCentral (double [] zeroLayer, int its,
            double u, double k, double dt, double dx) {
        super (zeroLayer, its, u, k, dt, dx);
    }

    @Override
    protected void doUnexistingStep (int step, double [] profile) {
        double [][] previous = {getTimeLayer (step - 1)};
        for (int i = 1; i < profile.length - 1; i++) {
            profile [i] = previous [0][i] * (1 - 2 * R)
                        + previous [0][i - 1] * (R + S / 2)
                        + previous [0][i + 1] * (R - S / 2);
        }
    }
    
}