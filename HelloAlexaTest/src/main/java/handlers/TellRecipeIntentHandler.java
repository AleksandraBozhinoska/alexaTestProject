package handlers;
import java.util.Optional;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import static com.amazon.ask.request.Predicates.intentName;

public class TellRecipeIntentHandler implements RequestHandler {
 
 public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("TellRecipeIntent"));
    }

public Optional<Response> handle(HandlerInput input) {
        String speechText = "I am here to tell a recipe master.";
       return input.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard("TellRecipe", speechText)
                .build();
    }

}