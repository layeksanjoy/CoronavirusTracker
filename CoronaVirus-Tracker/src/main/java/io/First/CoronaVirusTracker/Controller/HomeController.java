package io.First.CoronaVirusTracker.Controller;

import io.First.CoronaVirusTracker.models.LocationStats;
import io.First.CoronaVirusTracker.services.CoronaVirusDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    CoronaVirusDataService coronaVirusDataService;

    @GetMapping("/")  // --> when there is a mapping map it to the root directory
    public String home(Model model){
        // --> Spring is saying put anything you want in the model and we will have
        // it accessible when you are rendering your html
        List<LocationStats> allStats = coronaVirusDataService.getAllStats();
        int totalReportedCases = allStats.stream().mapToInt(stat -> stat.getLatestTotalCases()).sum();
        int totalReportedDiff = allStats.stream().mapToInt(stat -> stat.getPrevDay()).sum();
        model.addAttribute("locationStats", allStats);
        model.addAttribute("totalReportedCases",totalReportedCases);
        model.addAttribute("totalReportedDiff",totalReportedDiff);
        return "home";
        // --> this works also because of the thymeleaf dependency we are using
    }
}
