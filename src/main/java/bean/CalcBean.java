package bean;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "calcBean")
@javax.faces.bean.RequestScoped
public class CalcBean {

  public CalcBean() {
  }

  // properties
  private Integer firstOperand;
  private Integer secondOperand;
  private Integer operation;
  private Integer result;

  public Integer getFirstOperand() {
    return firstOperand;
  }

  public void setFirstOperand(Integer firstOperand) {
    this.firstOperand = firstOperand;
  }

  public Integer getSecondOperand() {
    return secondOperand;
  }

  public void setSecondOperand(Integer secondOperand) {
    this.secondOperand = secondOperand;
  }

  public Integer getOperation() {
    return operation;
  }

  public void setOperation(Integer operand) {
    this.operation = operand;
  }

  public Integer getResult() {
    return result;
  }

  public void setResult(Integer result) {
    this.result = result;
  }

  // performing the calculation
  public String calculate() {
    if (this.operation != null && this.firstOperand != null && this.secondOperand != null) {
      if (this.operation == 1) {
        this.result = this.firstOperand + this.secondOperand;
      }
      if (this.operation == 2) {
        this.result = this.firstOperand - this.secondOperand;
      }
      if (this.operation == 3) {
        this.result = this.firstOperand * this.secondOperand;
      }
      if (this.operation == 4) {
        this.result = this.firstOperand / this.secondOperand;
      }
    }
    return null;
  }

  // Redirects user to the about page
  public String about() {
    return "about";
  }

}