/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aquamind.auth;

/*
Author Piotr Konkol
*/
//Purpose of the file is to track the authentication stats, i.e. logins, what time, where
// In a real app this could be used to track where to advertise, track user behaviour etc.
/*
totalUsers
totalAttempts
failedAttempts
successfulAttempts
*/ 
public class authStats {

    private int totalUsers;
    private int totalAttempts;
    private int successfulAttempts;
    private int failedAttempts;

    public authStats() {
        totalUsers = 0;
        totalAttempts = 0;
        successfulAttempts = 0;
        failedAttempts = 0;
    }

    public void addUser() {
        totalUsers++;
    }

    public void addAttempt(boolean success) {
        totalAttempts++;

        if (success) {
            successfulAttempts++; // maybe similar to how Administrator does it, add the last successful attempt stamped, i.e when user logs on they will see when the last
                                  // time someone successfully logged on; would help with security and give another use for loginAttempts.
        } else {
            failedAttempts++;
        }
    }

    public int getTotalUsers() {
        return totalUsers;
    }

    public int getTotalAttempts() {
        return totalAttempts;
    }

    public int getSuccessfulAttempts() {
        return successfulAttempts;
    }

    public int getFailedAttempts() {
        return failedAttempts;
    }
}
