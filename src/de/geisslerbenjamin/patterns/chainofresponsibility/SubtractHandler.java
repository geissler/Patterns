package de.geisslerbenjamin.patterns.chainofresponsibility;

import de.geisslerbenjamin.patterns.chainofresponsibility.interfaces.RequestInterface;
import de.geisslerbenjamin.patterns.chainofresponsibility.interfaces.ResultInterface;

import java.util.regex.Pattern;

/**
 * Handler which tests if the request is a simple subtraction. If so, the sum is calculated otherwise the request is
 * forwarded to the next chain element.
 * Created by Benjamin on 22.12.13.
 */
public class SubtractHandler extends AbstractHandler {
    @Override
    public ResultInterface handleRequest(RequestInterface request) throws Exception {
        if (Pattern.matches("^[0-9]+(\\-[0-9]+)+$", request.getRequest())) {
            String[] numbers = request.getRequest().split("\\-");

            int sum = 0;
            boolean first = true;
            for (String number : numbers) {
                if (first) {
                    sum = Integer.parseInt(number);
                    first = false;
                } else {
                    sum -= Integer.parseInt(number);
                }

            }

            return new Result(sum);
        }

        return this.forwardToSuccessor(request);
    }
}
