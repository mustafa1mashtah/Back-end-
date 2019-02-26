package at.nacs.ex4theenglishgentleman;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@RequiredArgsConstructor

public class EnglishGentleman {
    private final Monocle monocle;
    private final Lighter lighter;
    @Getter
    private boolean read;
    @Getter
    private boolean smoke;


    public void smoke(Cigar cigar) throws CigarWasNotLitException {
        lighter.lit(cigar);
        cigar.smoke();
        smoke = true;

    }


    public void read(Newspaper newspaper) {
        monocle.read(newspaper);
        read = true;

    }


    public Boolean hadAGoodDay()  {
        return smoke && read;

    }


}
