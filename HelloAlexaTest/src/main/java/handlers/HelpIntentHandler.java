package handlers;
import java.util.Optional;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import static com.amazon.ask.request.Predicates.intentName;
import com.amazon.ask.model.Response;

public class HelpIntentHandler implements RequestHandler {
 
 public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("AMAZON.HelpIntent"));
    }

public Optional<Response> handle(HandlerInput input) {
        String speechText = "Need a recipe? Aks me.";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard("TellRecipe", speechText)
                .withReprompt(speechText)
                .build();
    }

}