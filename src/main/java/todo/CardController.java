package todo;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import todo.entities.Card;

@RestController
public class CardController {

	@RequestMapping("/card")
	public Card get( String username){
		Card crd = new Card();
		return crd;
	}
}
