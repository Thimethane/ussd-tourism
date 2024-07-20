package tourism;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller class to handle USSD requests.
 */
@RestController
public class UssdController {

    private final UssdService ussdService;

    public UssdController(UssdService ussdService) {
        this.ussdService = ussdService;
    }

    /**
     * Endpoint to handle USSD requests.
     *
     * @param phoneNumber The phone number making the request.
     * @param action      The action taken by the user.
     * @return The response message.
     */
    @GetMapping("/ussd")
    public String handleUssd(@RequestParam("phoneNumber") String phoneNumber,
                             @RequestParam("action") String action) {
        return ussdService.handleUssdRequest(phoneNumber, action);
    }
}
