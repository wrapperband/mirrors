package ee.joonasvali.scene.genetic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Genepool extends ArrayList<Gene> {
  public Genepool() { }

  public Genepool(List<Gene> list) {
    super(list);
  }

  public List<Gene> getGenes() {
    return Collections.unmodifiableList(this);
  }

  public Genepool getOffspring(Random rng) {
    List<Gene> pool = new ArrayList<>(this.size());
    for(Gene gene : this) {
      pool.add(gene.getOffspringGene(rng));
    }
    return new Genepool(pool);
  }
}
