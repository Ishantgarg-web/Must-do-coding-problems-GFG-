#include<bits/stdc++.h>
#include <cstdio>
#include <ctime>
using namespace std;

//Transaction class - transaction done by family members
class Transactions{
    int amount;
    string done_by;
    string time;
    string comment;
    Transactions(int a,string d,string t,string c){
		amount=a;
		done_by=d;
		time=t;
		comment=c;
	}
};

// // Request class - request raise by other family members 
class Request{
    public:
	    string Raise_by;  //Family member who raise this request
	    string Raise_for;  // Family member who raise this request for
	    string comment;  // any comment for request
	    bool done;  // this request is already done or not
	    int check;   // int value to check which type of request is this
	    bool reject;  // this request is rejected or not
	    Request(string r1,string r2,string c,bool b,int ch,bool r){
		    Raise_by=r1;
		    Raise_for=r2;
		    comment=c;
		    done=b;
		    check=ch;
		    reject=r;
	    }
	
// 	/***
// 	 * Check
// 	 * 1. permission_count
// 	 * 2. for today's permission
// 	 */
// }

// Dad class that do such things - explained using Methods
class Dad{
	string name;
	bool blockedD=false;  // use this to check user is blocked or not
	
	Dad(string name){
		this->name=name;
	}
	// This method add money from Bank1 to wallet
    void add_money_from_bank1() {
		if(blockedD==true) {
			cout << "sorry you are blocked by Dad";
			return;
		}
		if(main.bank1_balance>=0) { 
			// LocalDateTime myDateObj = LocalDateTime.now();
			// DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		    // string formattedDate = myDateObj.format(myFormatObj);
            std::time_t rawtime;
            std::tm* timeinfo;
            char formattedDate [80];

            std::time(&rawtime);
            timeinfo = std::localtime(&rawtime);

            std::strftime(formattedDate,80,"%d-%m-%Y %H-%M-%S",timeinfo);
			cout << "How much money you want to add from Bank1?" << endl;
			int x;
            cin >> x;
			if(x>=0) {
				if(x<=main.bank1_balance) {
					main.wallet+=x;
					cout << "Successfully,Money is added to Wallet" << endl;
					main.transaction.push_back(new Transactions(x,"Dad",formattedDate,"Added to wallet from Bank1"));
					return;
				}else {
					cout << "Sorry, you cann't exceed more than your Bank1 balance in your wallet" << endl;
					return;
				}
			}else {
				cout << "Please add valid amount" << endl;
				return;
			}
		}else {
			cout << "Your Bank1 balance is empty!!" << endl;
			return;
		}
	}
	// Dad can add money from Bank 2
	void add_money_from_bank2() {
		if(blockedD==true) {
			cout << "sorry you are blocked by Dad" << endl;
			return;
		}
		if(main.bank2_balance>=0) {
			// Below 3 lines checking for TimeStamp of Transaction
			// LocalDateTime myDateObj = LocalDateTime.now();
			// DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		    // string formattedDate = myDateObj.format(myFormatObj);
            std::time_t rawtime;
            std::tm* timeinfo;
            char formattedDate [80];

            std::time(&rawtime);
            timeinfo = std::localtime(&rawtime);

            std::strftime(formattedDate,80,"%d-%m-%Y %H-%M-%S",timeinfo);
	        cout << "How much money you want to add from Bank2?" << endl;
			int x;
            cin >> x;
			if(x>=0) {
				if(x<=main.bank2_balance) {
					main.wallet+=x;
					cout << "Successfully,Money is added to Wallet" << endl;
					main.transaction.push_back(new Transactions(x,"Dad",formattedDate,"Added to Wallet from Bank2"));
				}else {
					cout << "Sorry, you cann't exceed more than your Bank2 balance in your wallet" << endl;
				}
			}else {
			    cout << "Please add valid amount" << endl;
			}
		}else {
			cout << "Your Bank2 balance is empty!!" << endl;
		}
	}
	// Dad can withdraw money from wallet
    void withdraw_money() {
		if(blockedM==true) {
			cout << "sorry you are blocked by Dad" << endl;
			return;
		}
		cout << "How much money you want to withdraw?" << endl;
		int withdraw;
        cin >> withdraw;
		if(withdraw<0) {
			cout << "Please Enter Valid amount" << endl;
		}else {
			if(withdraw<=main.wallet) {
				main.wallet=main.wallet-withdraw;
				cout << "Withdraw Successfully!!" << endl;
				cout << "Now Wallet Balance is\n" + main->wallet << endl;
                std::time_t rawtime;
                std::tm* timeinfo;
                char formattedDate [80];

                std::time(&rawtime);
                timeinfo = std::localtime(&rawtime);

                std::strftime(formattedDate,80,"%d-%m-%Y %H-%M-%S",timeinfo);
		        cout << "How much money you want to add from Bank2?"<<endl;
			    main.transaction.push_back(new Transactions(withdraw,"Mom",formattedDate,"Withdraw money from wallet"));
			}else {
				cout << "Please Enter Valid amount" << endl;
			}
		}
	}
	// Dad can see all transactions
	void view_all_transactions() {
		if(blockedM==true) {
			cout << "sorry you are blocked by Dad"<<endl;
			return;
		}
		int len=main.transaction.size();
		if(len==0) {
			cout << "Sorry, No Entry found in Account Statement" << endl;
		}else {
			cout << "=============  ALL TRANSACTIONS =============" << endl;
			for (int i=0;i<len;i++)
			{
				cout << "****  Transaction %d ***\n",i+1 << endl;
				cout << "Amount is: "+main.transaction.get(i)->amount << endl;
				cout << "Payment Done By: "+main.transaction.get(i)->done_by << endl;
				cout << "Time Stamp of transaction: "+main.transaction.get(i)->time << endl;
				cout << "Any Comment: "+main.transaction.get(i)->comment << endl;
			}
		}
	
	// Dad can see all request raised by other family members
	void see_all_requests() {
		if(blockedM==true) {
			cout << "sorry you are blocked by Dad" << endl;
			return;
		}
		int len=main.request.size();
		if(len==0) {
			cout << "There are no requests pending!!" << endl;
		}else {
			cout << "======  ALL PENDING REQUESTS FOR MOM =====" << endl;
			for (int i=0;i<len;i++)
			{
				Request r1=main.request.get(i);
				if(r1.Raise_for=="Mom" && r1.done==false && r1.reject==false) {
					cout << "*** Pending Request  ***\n" << endl;
					cout << "Request Raise By: "+r1.Raise_by << endl;
					cout << "Any Comment on Request: "+r1.comment << endl;
					cout << "Want to take action against this request?\n if yes then Enter 1 else 2" << endl;
					int temp;
                    cin >> temp;
					if(temp==1) {
						if(r1.check==1) {  //for permission_count
							r1.done=true;
							if(r1.Raise_by=="child1") {
								child1.permission_count1++;
							}else if(r1.Raise_by=="child2") {
								child2.permission_count2++;
							}else if(r1.Raise_by=="child3") {
								child3.permission_count3++;
							}else if(r1.Raise_by=="child4") {
								child4.permission_count4++;
							}else if(r1.Raise_by=="child5") {
								child5.permission_count5++;
							}else if(r1.Raise_by=="child6") {
								child6.permission_count6++;
							}else if(r1.Raise_by=="child7") {
								child7.permission_count7++;
							}else if(r1.Raise_by=="child8") {
								child8.permission_count8++;
							}
							cout << "Successfully, Now this request is completed" << endl;
						}
					}else {
						cout << "What you want to do?\n 1. Accept the Request\n2. Reject the Request\n3. Transfer the Request to Dad" << endl;
						int temp1;
                        cin >> temp1;
						if(temp1==1) {
							r1.done=true;
							cout << "Successfully, Now this request is completed" << endl;
						}else if(temp1==2) {
							r1.reject=true;
							cout << "Request is rejected successfully" << endl;
						}else {
							main.request.push_back(new Request(r1.Raise_by,"Dad","Transfer by Mom",false,2,false));
							cout << "Your Request is successfully transfer to Dad" << endl;
						}
					}
				}
				
			}
		}
	}
	// Dad can see motifications
	void view_all_notifications() {
		if(blockedD==true) {
			cout << "sorry you are blocked by Dad" << endl;
			return;
		}
		if (main.wallet<=100){  
            cout << "Attention!! Wallet Balance is less than 100$" << endl;
		}else {
			cout << "There are no Notifications" << endl;
		}
	}
	// Dad can block any family member
	void Block_Member() {
		cout << "Whom you want to block From this Wallet System?" << endl;
		cout << "1. Child1\n2. Child2\n3. Child3\n4. Child4\n5. Child5\n6. Child 6\n7. Child 7\n8. Child 8\n9. Mom" << endl;
		int temp1;
        cin >> temp1;
		if(temp1==1) {
			child1.blocked1=true;
		}else if(temp1==2) {
			child2.blocked2=true;
		}else if(temp1==3) {
			child3.blocked3=true;
		}else if(temp1==4) {
			child4.blocked4=true;
		}else if(temp1==5) {
			child5.blocked5=true;
		}else if(temp1==6) {
			child6.blocked6=true;
		}else if(temp1==7) {
			child7.blocked7=true;
		}else if(temp1==8) {
			child8.blocked8=true;
		}else if(temp1==9) {
			Mom.blockedM=true;
		}else {
			cout << "Please Enter Valid Number" << endl;
		}
	}
	// Dad can unblock any family member
	void UnBlock_Member() {
		cout << "Whom you want to unblock From this Wallet System?" << endl;
		cout << "1. Child1\n2. Child2\n3. Child3\n4. Child4\n5. Child5\n6. Child 6\n7. Child 7\n8. Child 8\n9. Mom" << endl;
		int temp1;
        cin >> temp1;
		if(temp1==1) {
			child1.blocked1=false;
		}else if(temp1==2) {
			child2.blocked2=false;
		}else if(temp1==3) {
			child3.blocked3=false;
		}else if(temp1==4) {
			child4.blocked4=false;
		}else if(temp1==5) {
			child5.blocked5=false;
		}else if(temp1==6) {
			child6.blocked6=false;
		}else if(temp1==7) {
			child7.blocked7=false;
		}else if(temp1==8) {
			child8.blocked8=false;
		}else if(temp1==9) {
			Mom.blockedM=false;
		}else {
			cout << "Please Enter Valid Number" << endl;
		}
	}
}

// Mom class
class Mom{
	public:
        bool blockedM=false;
	    string name;
	    Mom(string name){
		    this->name=name;
	    }
	void add_money_from_bank1() {
		if(blockedM==true) {
			cout << "sorry you are blocked by Dad";
			return;
		}
		if(main.bank1_balance>=0) {
			// LocalDateTime myDateObj = LocalDateTime.now();
			// DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		    // String formattedDate = myDateObj.format(myFormatObj);
            std::time_t rawtime;
            std::tm* timeinfo;
            char formattedDate [80];

            std::time(&rawtime);
            timeinfo = std::localtime(&rawtime);

            std::strftime(formattedDate,80,"%d-%m-%Y %H-%M-%S",timeinfo);
			cout << "How much money you want to add from Bank1?" << endl;
			int x;
            cin >> x;
			if(x>=0) {
				if(x<=main.bank1_balance) {
					main.wallet+=x;
					cout << "Successfully,Money is added to Wallet" << endl;;
					main.transaction.push_back(new Transactions(x,"Mom",formattedDate,"Added to wallet from Bank1"));
					
				}else {
				    cout << "Sorry, you cann't exceed more than your Bank1 balance in your wallet" << endl;;
				}
			}else {
				cout << "Please add valid amount" << endl;
			}
		}else {
			cout << "Your Bank1 balance is empty!!"<<endl;
		}
	}
	void add_money_from_bank2() {
		if(blockedM==true) {
			cout << "sorry you are blocked by Dad" << endl;
			return;
		}
		if(main.bank2_balance>=0) {
			// LocalDateTime myDateObj = LocalDateTime.now();
			// DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		    // String formattedDate = myDateObj.format(myFormatObj);
            std::time_t rawtime;
            std::tm* timeinfo;
            char formattedDate [80];

            std::time(&rawtime);
            timeinfo = std::localtime(&rawtime);

            std::strftime(formattedDate,80,"%d-%m-%Y %H-%M-%S",timeinfo);
		    cout << "How much money you want to add from Bank2?"<<endl;
			int x;
            cin >> x;
			if(x>=0) {
				if(x<=main.bank2_balance) {
					main.wallet+=x;
					cout << "Successfully,Money is added to Wallet" << endl;
					main.transaction.push_back(new Transactions(x,"Mom",formattedDate,"Added to wallet from Bank1"));
				}else {
					cout << "Sorry, you cann't exceed more than your Bank2 balance in your wallet" << endl;
				}
			}else {
				cout << "Please add valid amount" << endl;
			}
		}else {
			cout << "Your Bank2 balance is empty!!"<<endl;
		}
	}
	void withdraw_money() {
		if(blockedM==true) {
			cout << "sorry you are blocked by Dad" << endl;
			return;
		}
		cout << "How much money you want to withdraw?" << endl;
		int withdraw;
        cin >> withdraw;
		if(withdraw<0) {
			cout << "Please Enter Valid amount" << endl;
		}else {
			if(withdraw<=main.wallet) {
				main.wallet=main.wallet-withdraw;
				cout << "Withdraw Successfully!!" << endl;
				cout << "Now Wallet Balance is\n" + main->wallet << endl;
				// LocalDateTime myDateObj = LocalDateTime.now();
				// DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
			    // String formattedDate = myDateObj.format(myFormatObj);
                std::time_t rawtime;
                std::tm* timeinfo;
                char formattedDate [80];

                std::time(&rawtime);
                timeinfo = std::localtime(&rawtime);

                std::strftime(formattedDate,80,"%d-%m-%Y %H-%M-%S",timeinfo);
		        cout << "How much money you want to add from Bank2?"<<endl;
			    main.transaction.push_back(new Transactions(withdraw,"Mom",formattedDate,"Withdraw money from wallet"));
			}else {
				cout << "Please Enter Valid amount" << endl;
			}
		}
	}
	void view_all_transactions() {
		if(blockedM==true) {
			cout << "sorry you are blocked by Dad"<<endl;
			return;
		}
		int len=main.transaction.size();
		if(len==0) {
			cout << "Sorry, No Entry found in Account Statement" << endl;
		}else {
			cout << "=============  ALL TRANSACTIONS =============" << endl;
			for (int i=0;i<len;i++)
			{
				cout << "****  Transaction %d ***\n",i+1 << endl;
				cout << "Amount is: "+main.transaction.get(i)->amount << endl;
				cout << "Payment Done By: "+main.transaction.get(i)->done_by << endl;
				cout << "Time Stamp of transaction: "+main.transaction.get(i)->time << endl;
				cout << "Any Comment: "+main.transaction.get(i)->comment << endl;
			}
		}
	}
	void see_all_requests() {
		if(blockedM==true) {
			cout << "sorry you are blocked by Dad" << endl;
			return;
		}
		int len=main.request.size();
		if(len==0) {
			cout << "There are no requests pending!!" << endl;
		}else {
			cout << "======  ALL PENDING REQUESTS FOR MOM =====" << endl;
			for (int i=0;i<len;i++)
			{
				Request r1=main.request.get(i);
				if(r1.Raise_for=="Mom" && r1.done==false && r1.reject==false) {
					cout << "*** Pending Request  ***\n" << endl;
					cout << "Request Raise By: "+r1.Raise_by << endl;
					cout << "Any Comment on Request: "+r1.comment << endl;
					cout << "Want to take action against this request?\n if yes then Enter 1 else 2" << endl;
					int temp;
                    cin >> temp;
					if(temp==1) {
						if(r1.check==1) {  //for permission_count
							r1.done=true;
							if(r1.Raise_by=="child1") {
								child1.permission_count1++;
							}else if(r1.Raise_by=="child2") {
								child2.permission_count2++;
							}else if(r1.Raise_by=="child3") {
								child3.permission_count3++;
							}else if(r1.Raise_by=="child4") {
								child4.permission_count4++;
							}else if(r1.Raise_by=="child5") {
								child5.permission_count5++;
							}else if(r1.Raise_by=="child6") {
								child6.permission_count6++;
							}else if(r1.Raise_by=="child7") {
								child7.permission_count7++;
							}else if(r1.Raise_by=="child8") {
								child8.permission_count8++;
							}
							cout << "Successfully, Now this request is completed" << endl;
						}
					}else {
						cout << "What you want to do?\n 1. Accept the Request\n2. Reject the Request\n3. Transfer the Request to Dad" << endl;
						int temp1;
                        cin >> temp1;
						if(temp1==1) {
							r1.done=true;
							cout << "Successfully, Now this request is completed" << endl;
						}else if(temp1==2) {
							r1.reject=true;
							cout << "Request is rejected successfully" << endl;
						}else {
							main.request.push_back(new Request(r1.Raise_by,"Dad","Transfer by Mom",false,2,false));
							cout << "Your Request is successfully transfer to Dad" << endl;
						}
					}
				}
				
			}
		}
	}
	void view_all_notifications() {
		if(blockedM==true) {
			cout << "sorry you are blocked by Dad" << endl;
			return;
		}
		if (main.wallet<=100){
			cout << "Attention!! Wallet Balance is less than 100$" << endl;
		}else {
			cout << "There are no Notifications" << endl;
		}
	}
};
// child1 class that can do 2 things - withdrawn money, ask permission to access wallet
class child1
{
	public:
        bool blocked1=false;
	    int permission_count1=0;
	    int today_pay1=0;
        string name1;
	    child1(string n,int p){
		    name1=n;
		    permission_count1=p;
	    }
	void pay_money_from_wallet(){
		if(blocked1==true) {
			cout << "sorry you are blocked by Dad" << endl;
			return;
		}
		if(permission_count1>=2) {
			cout << "How much money you want to withdraw from wallet?" << endl;
			int temp1;
            cin >> temp1;
			if(temp1+today_pay1<=50) {
				main.wallet-=temp1;
				cout << "You are successfully withdrawn money" << endl;
				// LocalDateTime myDateObj = LocalDateTime.now();
				// DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
			    // String formattedDate = myDateObj.format(myFormatObj);
                std::time_t rawtime;
                std::tm* timeinfo;
                char formattedDate [80];

                std::time(&rawtime);
                timeinfo = std::localtime(&rawtime);

                std::strftime(formattedDate,80,"%d-%m-%Y %H-%M-%S",timeinfo);
				main.transaction.push_back(new Transactions(temp1,"child1",formattedDate,"Amount is debited from Wallet"));
			}else {
				cout << "Sorry, you cann't exceed today's pay money by 50" << endl;
				cout << "Want to ask permission from Mom?" << endl;
				cout << "if yes, then enter 1 else 2" << endl;
				int ask;
                cin >> ask;
				if(ask==1) {
					//ask from Mom for payment permission
					main.request.push_back(new Request("child1","Mom","Request for greater than 50$ for today's",false,2,false));
					cout << "Request sent to Mom for payment permission" << endl;
				}else {
					cout << "Please Enter Valid Number" << endl;
				}
			}
		}else {
			cout << ("You cann't withdrawn money, because your today permission count<2") << endl;
			cout << ("Want to ask permission from Dad or Mom?") << endl;
			cout << ("if yes, then enter 1 else 2") << endl;
			int ask;
            cin >> ask;
			if(ask==1) {
				//ask from Mom for permission_count
				main.request.push_back(new Request("child1","Mom","Request for today permission to access wallet",false,1,false));
				main.request.push_back(new Request("child1","Dad","Request for today permission to access wallet",false,1,false));
				cout << "Permission for today wallet access permission is gone to Dad or Mom" << endl;
			}else {
				cout << "Please Enter Valid Number" << endl;
			}
		}
	}
	void Ask_permission_for_permissionCount() {
		if(blocked1==true) {
			cout << "sorry you are blocked by Dad" << endl;
			return;
		}
		if(permission_count1>=2) {
			cout << "You don't need today's permission for accessing the wallet" << endl;
		}else {
			main.request.push_back(new Request("child1","Mom","Request for today permission to access wallet",false,1,false));
			main.request.push_back(new Request("child1","Dad","Request for today permission to access wallet",false,1,false));
			cout << "Permission for today wallet access permission is gone to Dad and Mom" << endl;
		}
	}
};

class child2
{
	public:
        bool blocked1=false;
	    int permission_count1=0;
	    int today_pay1=0;
        string name1;
	    child1(string n,int p){
		    name1=n;
		    permission_count1=p;
	    }
	void pay_money_from_wallet(){
		if(blocked1==true) {
			cout << "sorry you are blocked by Dad" << endl;
			return;
		}
		if(permission_count1>=2) {
			cout << "How much money you want to withdraw from wallet?" << endl;
			int temp1;
            cin >> temp1;
			if(temp1+today_pay1<=50) {
				main.wallet-=temp1;
				cout << "You are successfully withdrawn money" << endl;
				// LocalDateTime myDateObj = LocalDateTime.now();
				// DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
			    // String formattedDate = myDateObj.format(myFormatObj);
                std::time_t rawtime;
                std::tm* timeinfo;
                char formattedDate [80];

                std::time(&rawtime);
                timeinfo = std::localtime(&rawtime);

                std::strftime(formattedDate,80,"%d-%m-%Y %H-%M-%S",timeinfo);
				main.transaction.push_back(new Transactions(temp1,"child2",formattedDate,"Amount is debited from Wallet"));
			}else {
				cout << "Sorry, you cann't exceed today's pay money by 50" << endl;
				cout << "Want to ask permission from Mom?" << endl;
				cout << "if yes, then enter 1 else 2" << endl;
				int ask;
                cin >> ask;
				if(ask==1) {
					//ask from Mom for payment permission
					main.request.push_back(new Request("child2","Mom","Request for greater than 50$ for today's",false,2,false));
					cout << "Request sent to Mom for payment permission" << endl;
				}else {
					cout << "Please Enter Valid Number" << endl;
				}
			}
		}else {
			cout << ("You cann't withdrawn money, because your today permission count<2") << endl;
			cout << ("Want to ask permission from Dad or Mom?") << endl;
			cout << ("if yes, then enter 1 else 2") << endl;
			int ask;
            cin >> ask;
			if(ask==1) {
				//ask from Mom for permission_count
				main.request.push_back(new Request("child2","Mom","Request for today permission to access wallet",false,1,false));
				main.request.push_back(new Request("child2","Dad","Request for today permission to access wallet",false,1,false));
				cout << "Permission for today wallet access permission is gone to Dad or Mom" << endl;
			}else {
				cout << "Please Enter Valid Number" << endl;
			}
		}
	}
	void Ask_permission_for_permissionCount() {
		if(blocked1==true) {
			cout << "sorry you are blocked by Dad" << endl;
			return;
		}
		if(permission_count1>=2) {
			cout << "You don't need today's permission for accessing the wallet" << endl;
		}else {
			main.request.push_back(new Request("child2","Mom","Request for today permission to access wallet",false,1,false));
			main.request.push_back(new Request("child2","Dad","Request for today permission to access wallet",false,1,false));
			cout << "Permission for today wallet access permission is gone to Dad and Mom" << endl;
		}
	}
};

class child3
{
	public:
        bool blocked1=false;
	    int permission_count1=0;
	    int today_pay1=0;
        string name1;
	    child1(string n,int p){
		    name1=n;
		    permission_count1=p;
	    }
	void pay_money_from_wallet(){
		if(blocked1==true) {
			cout << "sorry you are blocked by Dad" << endl;
			return;
		}
		if(permission_count1>=2) {
			cout << "How much money you want to withdraw from wallet?" << endl;
			int temp1;
            cin >> temp1;
			if(temp1+today_pay1<=50) {
				main.wallet-=temp1;
				cout << "You are successfully withdrawn money" << endl;
				// LocalDateTime myDateObj = LocalDateTime.now();
				// DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
			    // String formattedDate = myDateObj.format(myFormatObj);
                std::time_t rawtime;
                std::tm* timeinfo;
                char formattedDate [80];

                std::time(&rawtime);
                timeinfo = std::localtime(&rawtime);

                std::strftime(formattedDate,80,"%d-%m-%Y %H-%M-%S",timeinfo);
				main.transaction.push_back(new Transactions(temp1,"child3",formattedDate,"Amount is debited from Wallet"));
			}else {
				cout << "Sorry, you cann't exceed today's pay money by 50" << endl;
				cout << "Want to ask permission from Mom?" << endl;
				cout << "if yes, then enter 1 else 2" << endl;
				int ask;
                cin >> ask;
				if(ask==1) {
					//ask from Mom for payment permission
					main.request.push_back(new Request("child3","Mom","Request for greater than 50$ for today's",false,2,false));
					cout << "Request sent to Mom for payment permission" << endl;
				}else {
					cout << "Please Enter Valid Number" << endl;
				}
			}
		}else {
			cout << ("You cann't withdrawn money, because your today permission count<2") << endl;
			cout << ("Want to ask permission from Dad or Mom?") << endl;
			cout << ("if yes, then enter 1 else 2") << endl;
			int ask;
            cin >> ask;
			if(ask==1) {
				//ask from Mom for permission_count
				main.request.push_back(new Request("child3","Mom","Request for today permission to access wallet",false,1,false));
				main.request.push_back(new Request("child3","Dad","Request for today permission to access wallet",false,1,false));
				cout << "Permission for today wallet access permission is gone to Dad or Mom" << endl;
			}else {
				cout << "Please Enter Valid Number" << endl;
			}
		}
	}
	void Ask_permission_for_permissionCount() {
		if(blocked1==true) {
			cout << "sorry you are blocked by Dad" << endl;
			return;
		}
		if(permission_count1>=2) {
			cout << "You don't need today's permission for accessing the wallet" << endl;
		}else {
			main.request.push_back(new Request("child3","Mom","Request for today permission to access wallet",false,1,false));
			main.request.push_back(new Request("child3","Dad","Request for today permission to access wallet",false,1,false));
			cout << "Permission for today wallet access permission is gone to Dad and Mom" << endl;
		}
	}
};

class child4
{
	public:
        bool blocked1=false;
	    int permission_count1=0;
	    int today_pay1=0;
        string name1;
	    child1(string n,int p){
		    name1=n;
		    permission_count1=p;
	    }
	void pay_money_from_wallet(){
		if(blocked1==true) {
			cout << "sorry you are blocked by Dad" << endl;
			return;
		}
		if(permission_count1>=2) {
			cout << "How much money you want to withdraw from wallet?" << endl;
			int temp1;
            cin >> temp1;
			if(temp1+today_pay1<=50) {
				main.wallet-=temp1;
				cout << "You are successfully withdrawn money" << endl;
				// LocalDateTime myDateObj = LocalDateTime.now();
				// DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
			    // String formattedDate = myDateObj.format(myFormatObj);
                std::time_t rawtime;
                std::tm* timeinfo;
                char formattedDate [80];

                std::time(&rawtime);
                timeinfo = std::localtime(&rawtime);

                std::strftime(formattedDate,80,"%d-%m-%Y %H-%M-%S",timeinfo);
				main.transaction.push_back(new Transactions(temp1,"child4",formattedDate,"Amount is debited from Wallet"));
			}else {
				cout << "Sorry, you cann't exceed today's pay money by 50" << endl;
				cout << "Want to ask permission from Mom?" << endl;
				cout << "if yes, then enter 1 else 2" << endl;
				int ask;
                cin >> ask;
				if(ask==1) {
					//ask from Mom for payment permission
					main.request.push_back(new Request("child4","Mom","Request for greater than 50$ for today's",false,2,false));
					cout << "Request sent to Mom for payment permission" << endl;
				}else {
					cout << "Please Enter Valid Number" << endl;
				}
			}
		}else {
			cout << ("You cann't withdrawn money, because your today permission count<2") << endl;
			cout << ("Want to ask permission from Dad or Mom?") << endl;
			cout << ("if yes, then enter 1 else 2") << endl;
			int ask;
            cin >> ask;
			if(ask==1) {
				//ask from Mom for permission_count
				main.request.push_back(new Request("child4","Mom","Request for today permission to access wallet",false,1,false));
				main.request.push_back(new Request("child4","Dad","Request for today permission to access wallet",false,1,false));
				cout << "Permission for today wallet access permission is gone to Dad or Mom" << endl;
			}else {
				cout << "Please Enter Valid Number" << endl;
			}
		}
	}
	void Ask_permission_for_permissionCount() {
		if(blocked1==true) {
			cout << "sorry you are blocked by Dad" << endl;
			return;
		}
		if(permission_count1>=2) {
			cout << "You don't need today's permission for accessing the wallet" << endl;
		}else {
			main.request.push_back(new Request("child4","Mom","Request for today permission to access wallet",false,1,false));
			main.request.push_back(new Request("child4","Dad","Request for today permission to access wallet",false,1,false));
			cout << "Permission for today wallet access permission is gone to Dad and Mom" << endl;
		}
	}
};

class child5
{
	public:
        bool blocked1=false;
	    int permission_count1=0;
	    int today_pay1=0;
        string name1;
	    child5(string n,int p){
		    name1=n;
		    permission_count1=p;
	    }
	void pay_money_from_wallet(){
		if(blocked1==true) {
			cout << "sorry you are blocked by Dad" << endl;
			return;
		}
		if(permission_count1>=2) {
			cout << "How much money you want to withdraw from wallet?" << endl;
			int temp1;
            cin >> temp1;
			if(temp1+today_pay1<=50) {
				main.wallet-=temp1;
				cout << "You are successfully withdrawn money" << endl;
				// LocalDateTime myDateObj = LocalDateTime.now();
				// DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
			    // String formattedDate = myDateObj.format(myFormatObj);
                std::time_t rawtime;
                std::tm* timeinfo;
                char formattedDate [80];

                std::time(&rawtime);
                timeinfo = std::localtime(&rawtime);

                std::strftime(formattedDate,80,"%d-%m-%Y %H-%M-%S",timeinfo);
				main.transaction.push_back(new Transactions(temp1,"child5",formattedDate,"Amount is debited from Wallet"));
			}else {
				cout << "Sorry, you cann't exceed today's pay money by 50" << endl;
				cout << "Want to ask permission from Mom?" << endl;
				cout << "if yes, then enter 1 else 2" << endl;
				int ask;
                cin >> ask;
				if(ask==1) {
					//ask from Mom for payment permission
					main.request.push_back(new Request("child5","Mom","Request for greater than 50$ for today's",false,2,false));
					cout << "Request sent to Mom for payment permission" << endl;
				}else {
					cout << "Please Enter Valid Number" << endl;
				}
			}
		}else {
			cout << ("You cann't withdrawn money, because your today permission count<2") << endl;
			cout << ("Want to ask permission from Dad or Mom?") << endl;
			cout << ("if yes, then enter 1 else 2") << endl;
			int ask;
            cin >> ask;
			if(ask==1) {
				//ask from Mom for permission_count
				main.request.push_back(new Request("child5","Mom","Request for today permission to access wallet",false,1,false));
				main.request.push_back(new Request("child5","Dad","Request for today permission to access wallet",false,1,false));
				cout << "Permission for today wallet access permission is gone to Dad or Mom" << endl;
			}else {
				cout << "Please Enter Valid Number" << endl;
			}
		}
	}
	void Ask_permission_for_permissionCount() {
		if(blocked1==true) {
			cout << "sorry you are blocked by Dad" << endl;
			return;
		}
		if(permission_count1>=2) {
			cout << "You don't need today's permission for accessing the wallet" << endl;
		}else {
			main.request.push_back(new Request("child5","Mom","Request for today permission to access wallet",false,1,false));
			main.request.push_back(new Request("child5","Dad","Request for today permission to access wallet",false,1,false));
			cout << "Permission for today wallet access permission is gone to Dad and Mom" << endl;
		}
	}
};

class child6
{
	public:
        bool blocked1=false;
	    int permission_count1=0;
	    int today_pay1=0;
        string name1;
	    child6(string n,int p){
		    name1=n;
		    permission_count1=p;
	    }
	void pay_money_from_wallet(){
		if(blocked1==true) {
			cout << "sorry you are blocked by Dad" << endl;
			return;
		}
		if(permission_count1>=2) {
			cout << "How much money you want to withdraw from wallet?" << endl;
			int temp1;
            cin >> temp1;
			if(temp1+today_pay1<=50) {
				main.wallet-=temp1;
				cout << "You are successfully withdrawn money" << endl;
				// LocalDateTime myDateObj = LocalDateTime.now();
				// DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
			    // String formattedDate = myDateObj.format(myFormatObj);
                std::time_t rawtime;
                std::tm* timeinfo;
                char formattedDate [80];

                std::time(&rawtime);
                timeinfo = std::localtime(&rawtime);

                std::strftime(formattedDate,80,"%d-%m-%Y %H-%M-%S",timeinfo);
				main.transaction.push_back(new Transactions(temp1,"child6",formattedDate,"Amount is debited from Wallet"));
			}else {
				cout << "Sorry, you cann't exceed today's pay money by 50" << endl;
				cout << "Want to ask permission from Mom?" << endl;
				cout << "if yes, then enter 1 else 2" << endl;
				int ask;
                cin >> ask;
				if(ask==1) {
					//ask from Mom for payment permission
					main.request.push_back(new Request("child6","Mom","Request for greater than 50$ for today's",false,2,false));
					cout << "Request sent to Mom for payment permission" << endl;
				}else {
					cout << "Please Enter Valid Number" << endl;
				}
			}
		}else {
			cout << ("You cann't withdrawn money, because your today permission count<2") << endl;
			cout << ("Want to ask permission from Dad or Mom?") << endl;
			cout << ("if yes, then enter 1 else 2") << endl;
			int ask;
            cin >> ask;
			if(ask==1) {
				//ask from Mom for permission_count
				main.request.push_back(new Request("child6","Mom","Request for today permission to access wallet",false,1,false));
				main.request.push_back(new Request("child6","Dad","Request for today permission to access wallet",false,1,false));
				cout << "Permission for today wallet access permission is gone to Dad or Mom" << endl;
			}else {
				cout << "Please Enter Valid Number" << endl;
			}
		}
	}
	void Ask_permission_for_permissionCount() {
		if(blocked1==true) {
			cout << "sorry you are blocked by Dad" << endl;
			return;
		}
		if(permission_count1>=2) {
			cout << "You don't need today's permission for accessing the wallet" << endl;
		}else {
			main.request.push_back(new Request("child6","Mom","Request for today permission to access wallet",false,1,false));
			main.request.push_back(new Request("child6","Dad","Request for today permission to access wallet",false,1,false));
			cout << "Permission for today wallet access permission is gone to Dad and Mom" << endl;
		}
	}
};

class child7
{
	public:
        bool blocked1=false;
	    int permission_count1=0;
	    int today_pay1=0;
        string name1;
	    child7(string n,int p){
		    name1=n;
		    permission_count1=p;
	    }
	void pay_money_from_wallet(){
		if(blocked1==true) {
			cout << "sorry you are blocked by Dad" << endl;
			return;
		}
		if(permission_count1>=2) {
			cout << "How much money you want to withdraw from wallet?" << endl;
			int temp1;
            cin >> temp1;
			if(temp1+today_pay1<=50) {
				main.wallet-=temp1;
				cout << "You are successfully withdrawn money" << endl;
				// LocalDateTime myDateObj = LocalDateTime.now();
				// DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
			    // String formattedDate = myDateObj.format(myFormatObj);
                std::time_t rawtime;
                std::tm* timeinfo;
                char formattedDate [80];

                std::time(&rawtime);
                timeinfo = std::localtime(&rawtime);

                std::strftime(formattedDate,80,"%d-%m-%Y %H-%M-%S",timeinfo);
				main.transaction.push_back(new Transactions(temp1,"child7",formattedDate,"Amount is debited from Wallet"));
			}else {
				cout << "Sorry, you cann't exceed today's pay money by 50" << endl;
				cout << "Want to ask permission from Mom?" << endl;
				cout << "if yes, then enter 1 else 2" << endl;
				int ask;
                cin >> ask;
				if(ask==1) {
					//ask from Mom for payment permission
					main.request.push_back(new Request("child7","Mom","Request for greater than 50$ for today's",false,2,false));
					cout << "Request sent to Mom for payment permission" << endl;
				}else {
					cout << "Please Enter Valid Number" << endl;
				}
			}
		}else {
			cout << ("You cann't withdrawn money, because your today permission count<2") << endl;
			cout << ("Want to ask permission from Dad or Mom?") << endl;
			cout << ("if yes, then enter 1 else 2") << endl;
			int ask;
            cin >> ask;
			if(ask==1) {
				//ask from Mom for permission_count
				main.request.push_back(new Request("child7","Mom","Request for today permission to access wallet",false,1,false));
				main.request.push_back(new Request("child7","Dad","Request for today permission to access wallet",false,1,false));
				cout << "Permission for today wallet access permission is gone to Dad or Mom" << endl;
			}else {
				cout << "Please Enter Valid Number" << endl;
			}
		}
	}
	void Ask_permission_for_permissionCount() {
		if(blocked1==true) {
			cout << "sorry you are blocked by Dad" << endl;
			return;
		}
		if(permission_count1>=2) {
			cout << "You don't need today's permission for accessing the wallet" << endl;
		}else {
			main.request.push_back(new Request("child7","Mom","Request for today permission to access wallet",false,1,false));
			main.request.push_back(new Request("child7","Dad","Request for today permission to access wallet",false,1,false));
			cout << "Permission for today wallet access permission is gone to Dad and Mom" << endl;
		}
	}
};

class child8
{
	public:
        bool blocked1=false;
	    int permission_count1=0;
	    int today_pay1=0;
        string name1;
	    child8(string n,int p){
		    name1=n;
		    permission_count1=p;
	    }
	void pay_money_from_wallet(){
		if(blocked1==true) {
			cout << "sorry you are blocked by Dad" << endl;
			return;
		}
		if(permission_count1>=2) {
			cout << "How much money you want to withdraw from wallet?" << endl;
			int temp1;
            cin >> temp1;
			if(temp1+today_pay1<=50) {
				main.wallet-=temp1;
				cout << "You are successfully withdrawn money" << endl;
				// LocalDateTime myDateObj = LocalDateTime.now();
				// DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
			    // String formattedDate = myDateObj.format(myFormatObj);
                std::time_t rawtime;
                std::tm* timeinfo;
                char formattedDate [80];

                std::time(&rawtime);
                timeinfo = std::localtime(&rawtime);

                std::strftime(formattedDate,80,"%d-%m-%Y %H-%M-%S",timeinfo);
				main.transaction.push_back(new Transactions(temp1,"child8",formattedDate,"Amount is debited from Wallet"));
			}else {
				cout << "Sorry, you cann't exceed today's pay money by 50" << endl;
				cout << "Want to ask permission from Mom?" << endl;
				cout << "if yes, then enter 1 else 2" << endl;
				int ask;
                cin >> ask;
				if(ask==1) {
					//ask from Mom for payment permission
					main.request.push_back(new Request("child8","Mom","Request for greater than 50$ for today's",false,2,false));
					cout << "Request sent to Mom for payment permission" << endl;
				}else {
					cout << "Please Enter Valid Number" << endl;
				}
			}
		}else {
			cout << ("You cann't withdrawn money, because your today permission count<2") << endl;
			cout << ("Want to ask permission from Dad or Mom?") << endl;
			cout << ("if yes, then enter 1 else 2") << endl;
			int ask;
            cin >> ask;
			if(ask==1) {
				//ask from Mom for permission_count
				main.request.push_back(new Request("child8","Mom","Request for today permission to access wallet",false,1,false));
				main.request.push_back(new Request("child8","Dad","Request for today permission to access wallet",false,1,false));
				cout << "Permission for today wallet access permission is gone to Dad or Mom" << endl;
			}else {
				cout << "Please Enter Valid Number" << endl;
			}
		}
	}
	void Ask_permission_for_permissionCount() {
		if(blocked1==true) {
			cout << "sorry you are blocked by Dad" << endl;
			return;
		}
		if(permission_count1>=2) {
			cout << "You don't need today's permission for accessing the wallet" << endl;
		}else {
			main.request.push_back(new Request("child1","Mom","Request for today permission to access wallet",false,1,false));
			main.request.push_back(new Request("child1","Dad","Request for today permission to access wallet",false,1,false));
			cout << "Permission for today wallet access permission is gone to Dad and Mom" << endl;
		}
	}
};


public int main {
	public:
        int bank1_balance=500;  //Bank1 balance
	    int bank2_balance=400;  // Bank2 balance
	    int wallet=500;  // wallet balance
	    vector<Transactions> transaction;  //transaction arraylist - that stores all transactions
	    vector<Request> request;  // request arraylist - that stores all requests
	
	public:
        void check_balance() {
		cout << "Hi!!";
		cout << "Bank1 Balance is: "+main->bank1_balance;
		cout << "Bank2 Balance is: "+main->bank2_balance;
		cout << "Wallet Balance is: "+main->wallet;
	}
	
	public:
        void main() {
		// TODO Auto-generated method stub
		cout << "Welcome to DIGITAL WALLET SYSTEM";
		cout << "---------------------------------";
		cout << endl;
		Dad dad=new Dad("Dad");
		Mom mom=new Mom("Mom");
		child1 ch1=new child1("child1",0);
		child1 ch2=new child1("child2",0);
		child1 ch3=new child1("child3",0);
		child1 ch4=new child1("child4",0);
		child1 ch5=new child1("child5",0);
		child1 ch6=new child1("child6",0);
		child1 ch7=new child1("child7",0);
		child1 ch8=new child1("child8",0);
		// showing main menu
		cout << "Who you are?\n1. Child1\n2. Child2\n3. Child3\n4. Child4\n5. Child5\n6. Child 6\n7. Child 7\n8. Child 8\n9. Mom\n10. Dad\n11. Exit";
		int temp1;
        cin >> temp1;
		do {
			if(temp1==1) {
				cout << "What do you want to do?" << endl;
				cout << "1. Withdraw Money From Wallet\n2. Need Permission for today's access wallet" << endl;
				int temp2;
                cin >> temp2;
				if(temp2==1) {
					child1.pay_money_from_wallet();
				}else {
					child1.Ask_permission_for_permissionCount();
				}
			}else if(temp1==2) {
				cout << "What do you want to do?" << endl;
			    cout << "1. Withdraw Money From Wallet\n2. Need Permission for today's access wallet" << endl;
				int temp2;
                cin >> temp2;
				if(temp2==1) {
					child2.pay_money_from_wallet();
				}else {
					child2.Ask_permission_for_permissionCount();
				}
			}else if(temp1==3) {
				cout << "What do you want to do?" << endl;
				cout << "1. Withdraw Money From Wallet\n2. Need Permission for today's access wallet" << endl;
				int temp2;
                cin >> temp2;
				if(temp2==1) {
					child3.pay_money_from_wallet();
				}else {
					child3.Ask_permission_for_permissionCount();
				}
			}else if(temp1==4) {
				cout << "What do you want to do?" << endl;
				cout << "1. Withdraw Money From Wallet\n2. Need Permission for today's access wallet" << endl;
				int temp2;
                cin >> temp2;
				if(temp2==1) {
					child4.pay_money_from_wallet();
				}else {
					child4.Ask_permission_for_permissionCount();
				}
			}else if(temp1==5) {
				cout << "What do you want to do?" << endl;
				cout << "1. Withdraw Money From Wallet\n2. Need Permission for today's access wallet" << endl;
				int temp2;
                cin >> temp2;
				if(temp2==1) {
					child5.pay_money_from_wallet();
				}else {
					child5.Ask_permission_for_permissionCount();
				}
			}else if(temp1==6) {
				cout << "What do you want to do?" << endl;
				cout << "1. Withdraw Money From Wallet\n2. Need Permission for today's access wallet" << endl;
				int temp2;
                cin >> temp2;
				if(temp2==1) {
					child6.pay_money_from_wallet();
				}else {
					child6.Ask_permission_for_permissionCount();
				}
			}else if(temp1==7) {
				cout << "What do you want to do?" << endl;
				cout << "1. Withdraw Money From Wallet\n2. Need Permission for today's access wallet" << endl;
				int temp2;
                cin >> temp2;
				if(temp2==1) {
					child7.pay_money_from_wallet();
				}else {
					child7.Ask_permission_for_permissionCount();
				}
			}else if(temp1==8) {
				cout << "What do you want to do?" << endl;
				cout << "1. Withdraw Money From Wallet\n2. Need Permission for today's access wallet" << endl;
				int temp2;
                cin >> temp2;
				if(temp2==1) {
					child8.pay_money_from_wallet();
				}else {
					child8.Ask_permission_for_permissionCount();
				}
			}else if(temp1==9) {  //write for Mom 
				cout << "What do you want to do?" << endl;
				cout << "1. Want to add money from Bank1 to Wallet?\n"
						+ "2. Want to add money from Bank2 to Wallet?\n"
						+ "3. Witdraw Money\n"
						+ "4. View All Transactions\n"
						+ "5. See All Requests\n"
						+ "6. View All Notifications\n"
						+ "7. See Balance in Bank1, Bank2 and Wallet\n"
						+ "8. Exit" << endl;
				int temp2;
                cin >> temp2;
				while(temp2>=1 && temp2<8) {
					if(temp2==1) {
						Mom.add_money_from_bank1();
					}else if(temp2==2) {
						Mom.add_money_from_bank2();
					}else if(temp2==3) {
						Mom.withdraw_money();
					}else if(temp2==4) {
						Mom.view_all_transactions();
					}else if(temp2==5) {
						Mom.see_all_requests();
					}else if(temp2==6) {
						Mom.view_all_notifications();
					}else if(temp2==7) {
						main.check_balance();
					}else {
						break;
					}
					cout << "1. Want to add money from Bank1 to Wallet?\n"
							+ "2. Want to add money from Bank2 to Wallet?\n"
							+ "3. Witdraw Money\n"
							+ "4. View All Transactions\n"
							+ "5. See All Requests\n"
							+ "6. View All Notifications\n"
							+ "7. See Balance in Bank1, Bank2 and Wallet\n"
							+ "8. Exit" << endl;
					cin >> temp2;
				}
			}else if(temp1==10) {  //write for Dad
			    cout << "What do you want to do?" << endl;
				cout << "1. Want to add money from Bank1 to Wallet?\n"
						+ "2. Want to add money from Bank2 to Wallet?\n"
						+ "3. Witdraw Money\n"
						+ "4. View All Transactions\n"
						+ "5. See All Requests\n"
						+ "6. View All Notifications\n"
						+ "7. Want to Block any Family Member\n"
						+ "8. Want to UnBlock any family Member\n"
						+ "9. See Balance in Bank1, Bank2 and Wallet\n"
						+ "10. Exit" << endl;
				int temp2;
                cin >> temp2;
				do {
					if(temp2==1) {
						Dad.add_money_from_bank1();
					}else if(temp2==2) {
						Dad.add_money_from_bank2();
					}else if(temp2==3) {
						Dad.withdraw_money();
					}else if(temp2==4) {
						Dad.view_all_transactions();
					}else if(temp2==5) {
						Dad.see_all_requests();
					}else if(temp2==6) {
						Dad.view_all_notifications();
					}else if(temp2==7){
						Dad.Block_Member();
					}else if(temp2==8) {
						Dad.UnBlock_Member();
					}else if(temp2==9) {
						main.check_balance();
					}else {
						break;
					}
					cout << "1. Want to add money from Bank1 to Wallet?\n"
							+ "2. Want to add money from Bank2 to Wallet?\n"
							+ "3. Witdraw Money\n"
							+ "4. View All Transactions\n"
							+ "5. See All Requests\n"
							+ "6. View All Notifications\n"
							+ "7. Want to Block any Family Member\n"
							+ "8. Want to UnBlock any family Member\n"
							+ "9. See Balance in Bank1, Bank2 and Wallet\n"
							+ "10. Exit" << endl;
					cin >> temp2;
				}while(temp2>=1);
			}else {
				 cout << "!!! You are successfully logout !!!!" << endl;
				break;
			}
			cout << "Who you are?\n1. Child1\n2. Child2\n3. Child3\n4. Child4\n5. Child5\n6. Child 6\n7. Child 7\n8. Child 8\n9. Mom\n10. Dad\n11. Exit" << endl;
			temp1;
            cin >> temp1;
		}while(temp1>0);
		cout << "!!! You are successfully logout !!!!" << endl;
		cout << "Thanks for using our Digital Wallet System" << endl;
	}

}
