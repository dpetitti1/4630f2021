from prettytable import PrettyTable

if __name__ == '__main__':

    x = PrettyTable()
    x.field_names = ["Name:", "Problem:", "App found[name]/None:", "Likes:", "Don't likes:",
                     "Improvements:", "Age:", "Gender:", "Education/occupation:", "Comments:"]
    x.add_row(["Matt Tran", "Tracking sleep habits", "Pillow", "Auto tracks sleep and \nquality, convenient",
               "Show how you can improve \nyour sleep habits", "Make it free", 20, "Male",
               "Computer Science", "IOS Device\n\n"]),
    x.add_row(["Philip Yeh", "Track how much spent \non gambling", "Gamble Diary", "N/A",
               "Ugly UI, \ncosts money so did \nnot want to purchase", "Free trial, \nprettier UI",
               20, "Male", "Computer Science", "IOS Device\n\n\n"])
    x.add_row(["Jeremy Meuse", "Falling asleep more \neasily", "Headspace",
               "shows how to improve \nyourself, free trial \noption", "Limited content for free",
               "Connect with friends", 20, "Male", "Graphic Design", "IOS Device\n\n\n"])
    x.add_row(["Louis Nguyen", "Finding parking more \neasily", "N/A", "N/A",
               "Most apps are targeted to \nreserve garage/lots \nthat cost money",
               "Create an app that shows \navailable free spots", 20, "Male", "Mechanical Engineer", "IOS Device\n\n\n"])
    x.add_row(["Sue Petitti", "scan and store important \ndocs virtually", "Dropbox", "Convenient",
               "Not tech-savy so somewhat \nhard to use", "Make it more simplified", 63, "Female", "N/A", "IOS Device\n\n"])
    x.add_row(["Andrew Thompson", "Real time caller ID info", "Truecaller", "Allows you to block \nnumbers on app",
               "slow interface", "Fix bugs", 21, "Male", "Business", "IOS Device\n\n"])
    print(x)

    with open("Survey.txt", "w") as text_file:
        text_file.write(str(x))