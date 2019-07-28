/**
 * 
 */
package bean;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 * @author jan.pfeil
 *
 */
@Named
@SessionScoped
public class Settings implements Serializable {
  private static final long serialVersionUID = 1L;
  private String stage;

  // private static final Logger LOG = LoggerFactory.getLogger(Settings.class);

  public void updateStage() {
    // LOG.debug("update stage ");
    System.out.println("update stage " + this.stage);
  }

  /**
   * @return the stage
   */
  public String getStage() {
    return this.stage;
  }

  /**
   * @param stage
   *          the stage to set
   */
  public void setStage(String stage) {
    this.stage = stage;
  }
}
