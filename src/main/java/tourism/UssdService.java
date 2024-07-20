package tourism;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * Service class to handle USSD operations and database updates.
 */
@Service
public class UssdService {

    private final UserInteractionRepository userInteractionRepository;

    public UssdService(UserInteractionRepository userInteractionRepository) {
        this.userInteractionRepository = userInteractionRepository;
    }

    /**
     * Handles USSD requests and updates the database.
     *
     * @param phoneNumber The phone number making the request.
     * @param action      The action taken by the user.
     * @return The response message.
     */
    public String handleUssdRequest(String phoneNumber, String action) {
        // Create and save user interaction record
        UserInteraction interaction = new UserInteraction();
        interaction.setPhoneNumber(phoneNumber);
        interaction.setAction(action);
        interaction.setTimestamp(LocalDateTime.now());
        userInteractionRepository.save(interaction);

        // Simulate response (customize this as needed)
        return "Thank you for your action: " + action;
    }
}
