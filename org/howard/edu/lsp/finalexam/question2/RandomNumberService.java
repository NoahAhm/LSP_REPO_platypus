package org.howard.edu.lsp.finalexam.question2;

/**
 * Singleton service that provides random number generation capabilities.
 * This service allows setting different strategies for random number generation.
 */
public class RandomNumberService {
    private static RandomNumberService instance;
    private RandomNumberStrategy strategy;

    /**
     * Private constructor to prevent instantiation.
     */
    private RandomNumberService() {}

    /**
     * Provides access to the singleton instance of the service.
     * @return the singleton instance of RandomNumberService.
     */
    public static RandomNumberService getInstance() {
        if (instance == null) {
            instance = new RandomNumberService();
        }
        return instance;
    }

    /**
     * Sets the random number generation strategy.
     * @param strategy the random number strategy to be used.
     */
    public void setStrategy(RandomNumberStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Generates a random number using the current strategy.
     * @return a random number generated by the current strategy.
     */
    public int generateNumber() {
        if (strategy == null) {
            throw new IllegalStateException("Strategy not initialized");
        }
        return strategy.generateNumber();
    }
}