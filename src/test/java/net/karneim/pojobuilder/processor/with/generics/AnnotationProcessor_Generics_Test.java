package net.karneim.pojobuilder.processor.with.generics;

import net.karneim.pojobuilder.processor.AnnotationProcessor;
import net.karneim.pojobuilder.processor.with.ProcessorTestSupport;
import org.junit.Test;

import static net.karneim.pojobuilder.PbAssertions.assertThat;

/**
 * @feature The {@link AnnotationProcessor} generates builder classes.
 */
public class AnnotationProcessor_Generics_Test extends ProcessorTestSupport {

  /**
   * @throws Exception
   * @scenario the builder is created with appropriate generic properties.
   */
  @Test
  public void testShouldGenerateBuilderWithGenericProperties() throws Exception {
    // Given:
    sourceFor(Pojo.class);
    // When:
    boolean success = prj.compile();
    // Then:
    assertThat(prj)
        .generatedSameSourceAs(PojoBuilder.class)
        .compiled(PojoBuilder.class);
    assertThat(success).isTrue();
  }

  /**
   * @throws Exception
   * @scenario the builder is created with appropriate generic properties.
   */
  @Test
  public void testShouldGeneratePairBuilder() throws Exception {
    // Given:
    sourceFor(Pair.class);
    // When:
    boolean success = prj.compile();
    // Then:
    assertThat(prj)
        .generatedSameSourceAs(PairBuilder.class)
        .compiled(PairBuilder.class);
    assertThat(success).isTrue();
  }
}
