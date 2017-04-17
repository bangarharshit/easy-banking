package presenter;

import android.support.annotation.NonNull;

import com.drawers.banklib.model.ButtonModel;
import com.drawers.banklib.model.OtpModel;

import static com.drawers.banklib.utils.BankLibHelper.JAVASCRIPT_FUNCTION_TEMPLATE;

public class OtpPresenter {
  public static String getOtpSubmitJavascript(@NonNull OtpModel otpModel) {
    return String.format(
      JAVASCRIPT_FUNCTION_TEMPLATE,
      "document.getElementById('" + otpModel.getOtpInputSelector() +"').value = '" + otpModel.getOtp() +"';\n" +
        "document.getElementById('" + otpModel.getButtons().get(ButtonModel.Type.SUBMIT).getSelector() + "').click();",
      "submit_" + otpModel.getName()
    );
  }

  public static String getOtpCancel(OtpModel otpModel){
    return String.format(
      JAVASCRIPT_FUNCTION_TEMPLATE,
      "document.getElementById('" + otpModel.getButtons().get(ButtonModel.Type.CANCEL).getSelector() + "').click();",
      "cancel_" + otpModel.getName()
    );
  }

}