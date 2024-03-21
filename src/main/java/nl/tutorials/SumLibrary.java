package nl.tutorials;

import org.springframework.stereotype.Service;

@Service
public class SumLibrary {

    public double doubleSum(double a, double b) {
        return a + b;
    }
}