class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {

        int _bandTime = bandage[0];   //붕대를 감아야 하는 시간
        int _bandHeal = bandage[1];   //초마다 회복되는 양
        int _bandPlus = bandage[2];   //붕대를 다 감으면 추가로 회복되는 양

        int _bandCount = 0;   //붕대를 얼마나 감았는지 확인

        int _myHealth = health;  //내 체력

        int _lastAttacks = attacks[attacks.length-1][0];   //마지막 공격
        int _totalAttackCount = attacks.length;            //총 공격 횟수
        int _AttackCount = 0;                              //현재 공격 횟수

        for(int i = 0; i<_lastAttacks+1; i++){
            if(attacks[_AttackCount][0] == i){
                _myHealth -= attacks[_AttackCount][1];
                _bandCount = 0;
                _AttackCount++;
                System.out.println(i + " 공격 당했습니다! " + _myHealth);
                if(_myHealth < 1){
                    return -1;
                }
            }else{
                _bandCount++;
                _myHealth += _bandHeal;
                System.out.println(i + " 치료중입니다! " + _myHealth);

                if(_bandCount == _bandTime){
                    _myHealth += _bandPlus;
                    _bandCount = 0;
                    System.out.println(i + " 치료 성공! " + _myHealth);
                }

                if(_myHealth > health){
                    _myHealth = health;
                }
            }
        }

        int answer = _myHealth;
        if(answer < 1){
            return -1;
        }
        return answer;
    }
}
 