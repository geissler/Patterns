package de.geisslerbenjamin.patterns.structural.composite;

/**
 * A car engine as compound element with different "child" elements.
 * Created by Benjamin on 22.12.13.
 */
public class CarEngine extends CompoundCarComponent {
    private String fabric;

    /**
     * Constructor.
     *
     * @param fabric fabric of the engine
     */
    public CarEngine(String fabric) {
        super();
        this.fabric = fabric;
    }

    @Override
    public String getName() {
        return new StringBuilder()
                .append("Engine: ")
                .append(this.fabric)
                .append(" (Components: ")
                .append(super.getName())
                .append(")")
                .toString();
    }
}
