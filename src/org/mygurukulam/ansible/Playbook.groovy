package org.mygurukulam.ansible

def runAnsiblePlaybook(String inventoryPath, String testPlaybookPath , String ssh_pem) {
    echo "Running Ansible playbook"
    sh """
        ansible-playbook -i ${WORKSPACE}/"${inventoryPath}" \
        --private-key=${ssh_pem} \
        ${WORKSPACE}/"${testPlaybookPath}"
    """
}

// withCredentials([sshUserPrivateKey(credentialsId: 'SSH-key-jenkins', keyFileVariable: 'ssh_pem')]) {
//                         sh """
//                             ansible-playbook -i ${WORKSPACE}/postgres_stand_alone/tests/aws_ec2.yml \
//                             --private-key=${ssh_pem} \
//                             ${WORKSPACE}/postgres_stand_alone/tests/test.yml
//                         """
