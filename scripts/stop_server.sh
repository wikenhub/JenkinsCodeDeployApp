
#!/bin/bash
isExistApp=`pgrep java`
if [[ -n  $isExistApp ]]; then
   /home/ec2-user/apache-tomcat-9.0.90/bin/shutdown.sh
fi
