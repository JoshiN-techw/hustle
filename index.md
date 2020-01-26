image: <img src="images/MPP.png">
Oracle Identity Manager


Introduction:

	Oracle Identity Manager (OIM) is used by organizations for managing the lifecycle of users i.e. onboarding users, provisioning them to targets, handling the modifications and leaver process of identities, all on a single platform.

	It also allows users to manage their own identities and passwords.

	It also provides Single Sign-On (SSO) ability wherein users can sign in to one application and further is signed in to other applications without entering credentials repeatedly.


Product Architecture:

Oracle Identity Manager is a web application which is deployed on Weblogic server and communicates to the server via http/s.


Modes of accessing OIM:

	Identity Self Service console

	Identity System Administration console


Managing Reconciliation:

Reconciliation is the process by which operations, such as user creation, modification, or deletion, started on the target system are communicated to Oracle Identity Manager. The reconciliation process compares the entries in Oracle Identity Manager repository and the target system repository, determines the difference between the two repositories, and applies the latest changes to Oracle Identity Manager repository.


Managing the Scheduler:

In Oracle Identity Manager, it is often required to run jobs at specified times on a regular basis to manage various activities. Scheduler enables you to schedule jobs that automatically run predefined scheduled tasks at the specified time. This is illustrated by the following example:
To meet the security policies of an organization, employees may be required to change their product application password every 60 days. For this purpose, the system administrator has to ensure that an email is sent to all employees whose passwords for the respective product applications have expired. One approach would be to identify the set of users whose passwords have expired and send email to each employee manually. Alternatively, the system administrator can use a service, such as scheduler. In Oracle Identity Manager, there is a predefined scheduled task called Password Warning Task. The system administrator can use this scheduled task to create a scheduled job with the intended schedule.
