/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package termreportclient;

import services.Todaycasesall;

/**
 *
 * @author HP
 */
public class TermReportClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Todaycasesall tca = findData(49);
        System.out.println("Year : "+tca.getYearCase());
        System.out.println("Weeknum : "+tca.getWeeknumCase());
        System.out.println("New Case : "+tca.getWeeknumCase());
        System.out.println("Total Case : "+tca.getTotalCase());
        System.out.println("New Case Excludeabroad : "+tca.getNewCaseExcludeabroad());
        System.out.println("Total Case Excludeabroad : "+tca.getTotalCaseExcludeabroad());
        System.out.println("New Recovered : "+tca.getNewRecovered());
        System.out.println("Total Recovered : "+tca.getTotalRecovered());
        System.out.println("New Death : "+tca.getNewDeath());
        System.out.println("Total Death : "+tca.getTotalDeath());
        System.out.println("Case Foreign : "+tca.getCaseForeign());
        System.out.println("Case Prison : "+tca.getCasePrison());
        System.out.println("Case Walkin : "+tca.getCaseWalkin());
        System.out.println("Case New Previous : "+tca.getCaseNewPrev());
        System.out.println("Case New Different : "+tca.getCaseNewDiff());
        System.out.println("Death New Previous : "+tca.getDeathNewPrev());
        System.out.println("Death New Different : "+tca.getDeathNewDiff());
        System.out.println("Update Date : "+tca.getUpdateDate());
    }

    private static Todaycasesall findData(int weekCase) {
        services.TermReportWebService_Service service = new services.TermReportWebService_Service();
        services.TermReportWebService port = service.getTermReportWebServicePort();
        return port.findData(weekCase);
    }
    
}
