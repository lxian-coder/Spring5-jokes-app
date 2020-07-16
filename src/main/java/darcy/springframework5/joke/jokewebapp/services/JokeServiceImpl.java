package darcy.springframework5.joke.jokewebapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

/**
 * @author : Darcy Xian
 * @program : jokewebapp
 * @create : 2020-07-15  21:13
 */
@Service
public class JokeServiceImpl implements JokeService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
