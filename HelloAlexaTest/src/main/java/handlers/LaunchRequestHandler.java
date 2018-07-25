package handlers;
import java.util.Optional;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.LaunchRequest;
import com.amazon.ask.model.Response;
import static com.amazon.ask.request.Predicates.requestType;

public class LaunchRequestHandler implements RequestHandler  {
 
 public boolean canHandle(HandlerInput input) {
        return input.matches(requestType(LaunchRequest.class));
    }

public Optional<Response> handle(HandlerInput input) {
        String speechText = "Welcome to Recipe Teller, You can say Recipe";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard("TellRecipe", speechText)
                .withReprompt(speechText)
                .build();
    }

}